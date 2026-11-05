# 🐦 FlappyBird-Zafar

A Flappy Bird game built from scratch using Java and Java Swing.

This project was developed incrementally as a learning project. The goal was to understand the logic behind each game component rather than simply copying a finished implementation.

## 📁 Project Structure

```text
FlappyBird-Zafar/
├── .gitignore
├── README.md
├── progress.md
├── assets/
│   └── sounds/
│       ├── flap.wav
│       ├── score.wav
│       └── game-over.wav
└── src/
    ├── Bird.java
    ├── Game.java
    ├── GamePanel.java
    ├── Main.java
    ├── Pipe.java
    └── SoundManager.java
```

## 🚀 Development Progress

### Phase 1 — Foundation

- [x] Create Java project
- [x] Create main game entry point
- [x] Create game window
- [x] Create `GamePanel`
- [x] Set up the game loop

### Phase 2 — Bird Physics & Input

- [x] Create `Bird` class
- [x] Add gravity
- [x] Make the bird fall
- [x] Add jump functionality
- [x] Add keyboard input
- [x] Add bird wing animation

### Phase 3 — Pipes

- [x] Create `Pipe` class
- [x] Add pipes to the game
- [x] Add pipe gap
- [x] Make the gap work correctly
- [x] Add random pipe gaps
- [x] Add pipe movement
- [x] Remove pipes after they leave the screen

### Phase 4 — Core Gameplay

- [x] Bird-pipe collision detection
- [x] Ground collision
- [x] Game Over detection
- [x] Detect passed pipes
- [x] Score system
- [x] Display score
- [x] Restart / Replay functionality
- [x] Game state system

### Phase 5 — Sound Effects

- [x] Create `SoundManager.java`
- [x] Add bird flap sound
- [x] Add score sound
- [x] Add game-over sound
- [x] Connect sound effects to their game events
- [x] Test repeated sound playback

### Phase 6 — Difficulty Progression

- [x] Add difficulty-based pipe speed
- [x] Increase pipe speed at score 5
- [x] Increase pipe speed at score 10
- [x] Increase pipe speed at score 15
- [x] Apply current speed to existing pipes
- [x] Apply current speed to newly created pipes
- [x] Test difficulty progression

### Phase 7 — Final Cleanup & Testing

- [x] Remove debug output
- [x] Test restart behaviour
- [x] Test pipe reset
- [x] Test score reset
- [x] Test pipe collision
- [x] Test ground collision
- [x] Test flap sound
- [x] Test score sound
- [x] Test game-over sound
- [x] Test difficulty progression
- [x] Confirm complete game flow

## 📍 Current Status

**Project Development Complete ✅**

The game now includes:

- Bird gravity and jumping
- Keyboard controls
- Animated bird wings
- Randomly generated pipe gaps
- Moving pipes
- Pipe removal after leaving the screen
- Pipe and ground collision detection
- Game Over state
- Score tracking
- Restart / Replay functionality
- Multiple game states
- Sound effects
- Progressive difficulty
- Final cleanup and testing

### Difficulty Progression

The pipe speed increases as the player's score increases:

| Score | Pipe Speed |
|---:|---:|
| 0–4 | 3 |
| 5–9 | 4 |
| 10–14 | 5 |
| 15+ | 6 |

Both existing pipes and newly created pipes use the current difficulty speed.

### Game States

The game uses three main states:

- `READY`
- `PLAYING`
- `GAME_OVER`

### Current Game Flow

```text
READY
  │
  │ SPACE
  ▼
PLAYING
  │
  │ Collision / Ground
  ▼
GAME_OVER
  │
  │ SPACE
  ▼
PLAYING
```

## 🔊 Sound Effects

The game includes three sound effects:

- **Flap:** Plays when SPACE is pressed.
- **Score:** Plays when the bird successfully passes a pipe.
- **Game Over:** Plays when the bird hits a pipe or the ground.

Sound loading and playback are handled by the `SoundManager` class.

The flap audio is warmed up during loading to avoid a delay during its first playback.

## 🎮 Controls

| Key | Action |
|---|---|
| `SPACE` | Start the game |
| `SPACE` | Make the bird flap |
| `SPACE` | Restart after Game Over |

## 🛠️ Technology

- Java
- Java Swing
- Java Sound API
- Git
- GitHub

## 🎯 Learning Outcomes

This project was developed step-by-step to understand:

- Java classes and objects
- Swing components
- Game loops
- Timers and event handling
- Keyboard input
- 2D movement
- Gravity and jumping
- Collision detection
- Game states
- Score systems
- Animation
- Sound effects
- Difficulty progression
- Clean project structure
- Git and GitHub workflow

## 📌 Development Tracker

Detailed step-by-step development progress is maintained in [`progress.md`](progress.md).

The complete development history, including individual implementation steps and testing checkpoints, is documented there.

## ✅ Project Status

**Completed**

The core Flappy Bird game has been implemented, tested, and is ready to be used as a completed Java learning project.