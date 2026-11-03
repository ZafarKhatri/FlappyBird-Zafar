# 🐦 FlappyBird-Zafar

A Flappy Bird game built from scratch using Java and Java Swing.

This project is being developed incrementally as a learning project. The goal is to understand the logic behind each game component rather than simply copying a finished implementation.

## 📁 Current Project Structure

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

## 📍 Current Status

**Step 23 — Sound Effects: COMPLETE ✅**

The game now includes three sound effects:

- Bird flap sound plays when SPACE is pressed.
- Score sound plays when the bird passes a pipe.
- Game-over sound plays when the bird hits a pipe or the ground.

Sound loading and playback are handled by the `SoundManager` class. The flap audio is warmed up during loading to avoid a delay on its first playback.

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

The current game states are:

- `READY`
- `PLAYING`
- `GAME_OVER`

### Next Step

**Step 24 — Difficulty Progression**

The next goal is to make the game progressively more challenging as the player continues.

## 🗺️ Planned Roadmap

### Phase 6 — Polish

- [x] Improve graphics
- [x] Add bird animation
- [x] Add sound effects
- [ ] Add difficulty progression
- [ ] Add high-score system

### Phase 7 — Finalization

- [ ] Code cleanup
- [ ] Testing
- [ ] Bug fixing
- [ ] Final documentation

## 🎯 Learning Approach

This project is being developed step-by-step with a focus on understanding:

- Java classes and objects
- Swing components
- Game loops
- Timers and event handling
- Keyboard input
- 2D movement
- Collision detection
- Game states
- Score systems
- Animation
- Sound effects
- Clean project structure

## 🛠️ Technology

- Java
- Java Swing
- Java Sound API
- Git
- GitHub

## 📌 Development Tracker

Detailed step-by-step development progress is maintained in [`progress.md`](progress.md).
