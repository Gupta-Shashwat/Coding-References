# Typography
### The Typography component is used to create and style text in a web application. It provides a simple way to apply typography styles such as font size, font weight, and line height to text.

Syntax:
```jsx
import { Typography } from '@material-ui/core';

const MyTypography = () => {
  return (
    <Typography variant="h1" color="primary" align="center">
      Hello, World!
    </Typography>
  );
}
```

Attributes:
- `variant` (string): Determines the variant of the typography. Values can be "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "caption", "button", or "overline".
- `color` (string): Determines the color of the typography. Values can be "initial" (default), "inherit", "primary", "secondary", "textPrimary", "textSecondary", "error", or any valid CSS color.
- `align` (string): Determines the alignment of the typography. Values can be "inherit", "left", "center", "right", or "justify".
- `gutterBottom` (boolean): Adds a margin bottom to the typography. Default is false.
- `noWrap` (boolean): Prevents text from wrapping to the next line. Default is false.
- `paragraph` (boolean): Adds a margin bottom to the typography. Default is false.
- `variantMapping` (object): Overrides the default mapping between variant and HTML tag. Example: `{ h1: 'h2', h2: 'h3' }` will render `h1` as `h2` and `h2` as `h3`.
- `component` (string): Overrides the default HTML tag of the typography. Default is "span".

The Typography component provides a convenient way to apply typography styles to text without having to write custom CSS. The `variant` attribute allows you to choose from a range of pre-defined typography styles, while other attributes such as `color`, `align`, and `gutterBottom` provide additional styling options.

In addition, the Typography component can be extended by using the `variantMapping` and `component` attributes. The `variantMapping` attribute allows you to customize the mapping between variant and HTML tag, while the `component` attribute allows you to override the default HTML tag of the typography. This makes it easy to create custom typography styles that match your design requirements.