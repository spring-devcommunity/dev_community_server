const deleteButton = document.getElementById('delete-btn');
if(deleteButton){
    deleteButton.addEventListener('click', event =>{
        let id = document.getElementById('post-id').value;
        fetch(`/${id}`, { method:'delete' })
            .then(()=>{
                alert('삭제되었습니다.');
                location.replace(`/${id}`);
            });
    });
}

const modifyButton = document.getElementById('modify-btn');
if(modifyButton){
    modifyButton.addEventListener('click', event=>{
        let params = new URLSearchParams(location.search); // Query String
        let id = params.get('id');

        fetch(`/${id}`, {
            method: 'put',
            headers: { "content-type": "application/json" },
            body: JSON.stringify({
                title: document.getElementById('title').value,
                content: document.getElementById('content').value
            })
        })
            .then(()=>{
                alert('수정되었습니다.');
                location.replace(`/${id}`);
            });
    });
}

const createButton = document.getElementById('create-btn');
if(createButton){
    createButton.addEventListener('click', event=>{
        fetch(`/api/post`, {
            method: 'post',
            headers: { "content-type": "application/json" },
            body: JSON.stringify({
                title: document.getElementById('title').value,
                content: document.getElementById('content').value
            })
        })
            .then(()=>{
                alert('등록되었습니다.');
                location.replace(`/${id}`);
            });
    });
}