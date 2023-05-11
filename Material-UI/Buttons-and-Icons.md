# Buttons and Icons

## 1. Buttons

### The Button component is used to create interactive buttons in a web application. It provides a simple way to create a variety of button styles, including text buttons, outlined buttons, contained buttons, and icon buttons.

Syntax:
```jsx
import { Button } from '@material-ui/core';

const MyButton = () => {
  return (
    <Button variant="contained" color="primary" size="large">
      Click Me
    </Button>
  );
}
```

Attributes:
- `variant` (string): Determines the style of the button. Values can be "text", "outlined", "contained", or "icon".
- `color` (string): Determines the color of the button. Values can be "default", "primary", "secondary", "error", "warning", "info", or "success".
- `size` (string): Determines the size of the button. Values can be "small", "medium", or "large".
- `disabled` (boolean): Determines whether the button is disabled. Default is false.
- `fullWidth` (boolean): Determines whether the button should take up the full width of its container. Default is false.
- `startIcon` (node): Determines the icon displayed at the start of the button text.
- `endIcon` (node): Determines the icon displayed at the end of the button text.
- `onClick` (function): A callback function that is called when the button is clicked.
- `className` (string): A class name to apply to the button.

The Button component provides a flexible and powerful way to create interactive buttons in a web application. By using the `variant`, `color`, and `size` attributes, you can create a variety of button styles to suit your needs. In addition, the Button component provides a wide range of other attributes for controlling the behavior and appearance of the button, such as `disabled`, `fullWidth`, `startIcon`, and `endIcon`. This makes it easy to create buttons that are both functional and visually appealing.

Overall, the Button component is a powerful and flexible tool that can be used to create a variety of interactive buttons in a web application. Whether you need a simple text button or a complex icon button, the Button component provides all the features you need to create a functional and visually appealing button.

## 2. Icons

### 1. Icon
The Icon component is used to display vector icons in a web application. It provides a simple way to add icons to buttons, links, and other UI elements.

Syntax:
```jsx
import { Icon } from '@material-ui/core';

const MyIcon = () => {
  return (
    <Icon>add_circle</Icon>
  );
}
```

Attributes:
- `color` (string): Determines the color of the icon. Values can be "inherit", "primary", "secondary", "action", "error", "disabled", "default".
- `fontSize` (string): Determines the size of the icon. Values can be "inherit", "default", "small", "medium", "large".
- `className` (string): Determines the class name of the icon.

### 2. IconButton
The IconButton component is a specialized version of the Button component that displays an icon instead of text.

Syntax:
```jsx
import { IconButton } from '@material-ui/core';
import { AddCircle } from '@material-ui/icons';

const MyIconButton = () => {
  return (
    <IconButton aria-label="Add circle icon">
      <AddCircle />
    </IconButton>
  );
}
```

Attributes:
- `color` (string): Determines the color of the icon. Values can be "inherit", "primary", "secondary", "action", "error", "disabled", "default".
- `disabled` (boolean): Determines whether the button is disabled. Default is false.
- `size` (string): Determines the size of the button. Values can be "small", "medium", "large".
- `edge` (string): Determines the edge of the button. Values can be "start" or "end".
- `className` (string): Determines the class name of the button.

### 3. SvgIcon
The SvgIcon component is used to display custom SVG icons in a web application. It provides a simple way to add custom icons to buttons, links, and other UI elements.

Syntax:
```jsx
import { SvgIcon } from '@material-ui/core';

const MySvgIcon = () => {
  return (
    <SvgIcon>
      <path d="M22 12h-4l-3 8L9 4l-3 8H2" />
    </SvgIcon>
  );
}
```

Attributes:
- `color` (string): Determines the color of the icon. Values can be "inherit", "primary", "secondary", "action", "error", "disabled", "default".
- `fontSize` (string): Determines the size of the icon. Values can be "inherit", "default", "small", "medium", "large".
- `viewBox` (string): Determines the view box of the icon.
- `component` (elementType): Determines the type of component to render the icon as (e.g. "span", "div", etc.).
- `className` (string): Determines the class name of the icon.

Overall, the Icons component provides a powerful and flexible way to add vector and custom icons to a web application. Whether you need to add simple icons to buttons or complex custom icons to other UI elements, the Icons component provides all the features you need to create a professional and polished user interface.