/**
 * 
 */
		$(function(){
				//User1
				$('#btnUser1s').click(function(){
					
					$.ajax({
						url: "/Ch10/user2",
						type:"GET",
						dataType : "json",
						success : function(data){
							console.log(data);
						}
						
					});//ajax end
					
				});//click end
				
				$('#btnUser1').click(function(){
					$.ajax({
						url: "/Ch10/user1/A102",
						type:"GET",
						dataType : "json",
						success : function(data){
							console.log(data);
						}
						
					});//ajax end
				});
				
				$('#btnUser1Register').click(function(){
					
					const jsonData = {
						id:'s101',
						name : "홍길동",
						hp : '010-1111-1001',
						age : 22
					}
					
					
					$.ajax({
						url: "/Ch10/user1",
						type:"POST",
						data:jsonData,
						dataType : "json",
						success : function(data){
							console.log(data);
						}
						
					});//ajax end
					
				});
				
				$('#btnUser1Modify').click(function(){
					
					
						const jsonData = {
						id:'s101',
						name : "홍길동",
						hp : '010-2222-1001',
						age : 22
					}
					
					
					$.ajax({
						url: "/Ch10/user1",
						type:"PUT",
						data:jsonData,
						dataType : "json",
						success : function(data){
							console.log(data);
						}
						
					});//ajax end

					
				});
				
				$('#btnUser1Delete').click(function(){
					
					$.ajax({
						url:"/Ch10/user1/s101",
						type:"DELETE",
						dataType : "json",
						success : function(data){
							console.log(data);
						}
					})
					
				});
				
			});
				
		
		