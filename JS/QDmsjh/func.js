// 字符串反转
function revStr(str){
  let tempStr = ''
  for(let i = str.length ; i>=0 ; i--){
    tempStr += str.charAt(i);
  }
  return tempStr
}
/* const str = 'jklgfjksd0';
console.log(revStr(str)); */
