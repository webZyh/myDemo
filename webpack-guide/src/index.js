async function getComponent() {
    const element = document.createElement('div');
    const { default: _ } = await import(/* webpackChunkName: "lodash" */ 'lodash');
    element.innerHTML = _.join(['Hello', 'aaa'], ' ');
    return element;
}
getComponent().then(component => {
    document.body.appendChild(component);
})
