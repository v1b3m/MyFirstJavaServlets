/* global location, document */

function hello() {
  const params = new URL(location.href).searchParams;
  const username = params.get('username');
  const greetings = document.getElementById('greetings');
  greetings.innerHTML  = `Hello, ${username}! 
    <br><br> I am called v1b3m!
    <br> And yes, it's nice to meet me!
    <br><br> Well, this is my first java servlet and I really hope you enjoy viewing it half as much as I enjoyed making it!
    <br> I love you.`;
}

hello();