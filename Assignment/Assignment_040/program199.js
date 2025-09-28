function Display()
{
    let ch = 'A', no = 5;

     while (no >= 1)
     {
        console.log(ch);
        ch = String.fromCharCode(ch.charCodeAt(0) + 1);
        no--;
     }
     
}
Display();