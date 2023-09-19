# Sierpinski Triangle Generator

## Description

This Java project generates Sierpinski triangles of a user-inputted order. The Sierpinski triangle is a fractal pattern that consists of equilateral triangles recursively subdivided into smaller triangles. Each iteration increases the level of detail and complexity, creating a visually appealing geometric pattern.

## Table of Contents

- [Requirements](#requirements)
- [Usage](#usage)
- [Example](#example)
- [Algorithm](#algorithm)
- [Contributing](#contributing)
- [License](#license)

## Requirements

- Java Development Kit (JDK) 8 or higher
- Git (optional, for cloning the repository)

## Usage

1. Clone this repository or download the project source code.
   
   ```shell
   git clone https://github.com/your-username/sierpinski-triangle-generator.git
   ```

2. Open a terminal and navigate to the project directory.

   ```shell
   cd sierpinski-triangle-generator
   ```

3. Compile the Java source code.

   ```shell
   javac SierpinskiTriangle.java
   ```

4. Run the program with the desired order (an integer) as a command-line argument.

   ```shell
   java SierpinskiTriangle <order>
   ```

   Replace `<order>` with the desired order of the Sierpinski triangle. For example, to generate a Sierpinski triangle of order 4:

   ```shell
   java SierpinskiTriangle 4
   ```

5. The program will display the Sierpinski triangle in the console.

## Example

Let's say you want to generate a Sierpinski triangle of order 3. You would run the program like this:

```shell
java SierpinskiTriangle 3
```

The program would generate and display the Sierpinski triangle:

```
              *              
             * *             
            *   *            
           * * * *           
          *       *          
         * *     * *         
        *   *   *   *        
       * * * * * * * *       
      *               *      
     * *             * *     
    *   *           *   *    
   * * * *         * * * *   
  *       *       *       *  
 * *     * *     * *     * * 
*   *   *   *   *   *   *   *
```

## Algorithm

The Sierpinski triangle generation is based on a recursive algorithm. At each level of recursion, a triangle is divided into three smaller triangles by connecting the midpoints of its sides. The algorithm continues recursively until the desired order is reached.

## Contributing

If you would like to contribute to this project, feel free to submit pull requests, report issues, or suggest improvements. Please follow the [Contributor Covenant Code of Conduct](CODE_OF_CONDUCT.md) when contributing.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
