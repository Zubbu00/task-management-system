const API_URL = "http://localhost:8080/tasks";

// Load tasks when page opens
window.onload = loadTasks;

function loadTasks() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const list = document.getElementById("taskList");
            list.innerHTML = "";

            data.forEach(task => {
                const li = document.createElement("li");
                li.className = task.completed ? "done" : "";

                li.innerHTML = `
                    ${task.title}
                    <div>
                        <button onclick="markDone(${task.id})">Done</button>
                        <button onclick="deleteTask(${task.id})">Delete</button>
                    </div>
                `;
                list.appendChild(li);
            });
        });
}

// Add new task
function addTask() {
    const title = document.getElementById("taskInput").value;

    fetch(API_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
            title: title,
            completed: false
        })
    }).then(() => {
        document.getElementById("taskInput").value = "";
        loadTasks();
    });
}

// Mark task as completed
function markDone(id) {
    fetch(`${API_URL}/${id}`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ completed: true })
    }).then(loadTasks);
}

// Delete task
function deleteTask(id) {
    fetch(`${API_URL}/${id}`, {
        method: "DELETE"
    }).then(loadTasks);
}
