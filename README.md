# Number Guessing Game

![Number Guessing Game Banner](https://example.com/number-guessing-game-banner.png) (You can add a banner/image if you want)

Welcome to the Number Guessing Game! Test your intuition and number sense with this engaging and challenging game. Choose the number of digits for your secret number and then try to guess it correctly within 10 attempts. Will you be able to crack the code, or will you run out of guesses?

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [How to Play](#how-to-play)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Number Guessing Game is a console-based application built with Python. It allows players to choose the length of the secret number (2, 3, or 4 digits) they want to guess. The game provides feedback after each guess, helping players refine their guesses and increase their chances of winning. Players have a limited number of attempts to guess the correct number, and the game keeps track of their guesses for reference.

## Features

- Choose the length of the secret number (2, 3, or 4 digits).
- Receive feedback after each guess to guide your subsequent guesses.
- Win the game by guessing the correct number within 10 attempts.
- View all your guesses at the end of the game.
- Replay the game or exit after finishing a round.

## Installation

To play the Number Guessing Game, follow these steps:

1. Clone this GitHub repository to your local machine.
   ```bash
   git clone https://github.com/yourusername/number-guessing-game.git
   cd number-guessing-game
   ```

2. Make sure you have Python 3.x installed on your computer.

3. Run the game:
   ```bash
   python number_guessing_game.py
   ```

## How to Play

1. Run the game by executing `number_guessing_game.py`.

2. The game will prompt you to choose the number of digits for the secret number (2, 3, or 4). Enter your choice and press Enter.

3. The game will generate a random secret number within the chosen digit range. You have a maximum of 10 attempts to guess the correct number.

4. After each guess, the game will provide feedback:
   - If your guess is lower than the actual number, you'll be prompted to increase your guess.
   - If your guess is higher than the actual number, you'll be prompted to decrease your guess.

5. Continue guessing until you either guess the correct number or run out of attempts.

6. If you successfully guess the number within the allotted attempts, you win! The game will display your guesses and congratulate you.

7. If you don't guess the number within 10 attempts, you lose. The game will reveal the correct number and display your guesses.

8. After the game finishes, you will be asked if you want to replay the game. If you choose to replay, the game will restart with a new secret number. If you choose not to replay, the game will close.

## Contributing

We welcome contributions to enhance the Number Guessing Game! If you have ideas for improvements, new features, or bug fixes, follow these steps:

1. Fork the repository.

2. Create a new branch with a descriptive name:
   ```bash
   git checkout -b feature/new-feature
   ```

3. Make your changes and commit them:
   ```bash
   git commit -m "Add new feature" -m "Description of the changes made"
   ```

4. Push your changes to your forked repository:
   ```bash
   git push origin feature/new-feature
   ```

5. Open a pull request on the original repository, explaining your changes in detail.

We will review your contribution and merge it if it aligns with the project's guidelines.

## License

This project is licensed under the [MIT License](LICENSE). You are free to use and modify the code according to the terms of this license.

---

Enjoy the challenge of the Number Guessing Game! If you encounter any issues or have suggestions for improvements, don't hesitate to open an issue on GitHub. Best of luck with your guesses!
