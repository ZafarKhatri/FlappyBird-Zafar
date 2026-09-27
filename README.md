# 🐦 FlappyBird-Zafar

A Flappy Bird game built from scratch using Java.

This project is being developed incrementally as a learning project. The goal is to understand the logic behind each game component rather than simply copying a finished implementation.

## 📁 Current Project Structure

```text
FlappyBird-Zafar/

├── FLOW_DIAGRAM_REFRENCE.png
├── progress.md
└── src/
    ├── Bird.java
    ├── Game.java
    ├── GamePanel.java
    ├── Main.java
    └── Pipe.java
```

## 🚀 Development Progress

### Phase 1 — Foundation

* [x] Create Java project
* [x] Create main game entry point
* [x] Create game window
* [x] Create `GamePanel`
* [x] Set up the game loop

### Phase 2 — Bird Physics & Input

* [x] Create `Bird` class
* [x] Add gravity
* [x] Make the bird fall
* [x] Add jump functionality
* [x] Add keyboard input

### Phase 3 — Pipes

* [x] Create `Pipe` class
* [x] Add pipes to the game
* [x] Add pipe gap
* [x] Make the gap work correctly
* [x] Add random pipe gaps
* [x] Add pipe movement
* [x] Remove pipes after they leave the screen

### Phase 4 — Core Gameplay

* [x] Bird-pipe collision detection
* [x] Ground collision
* [x] Game Over detection
* [x] Detect passed pipes
* [x] Score system
* [x] Display score
* [x] Restart / Replay functionality
* [x] Game state system

## 📍 Current Status

**Step 20 — Game States: COMPLETE ✅**

The game now supports restarting after Game Over and uses game states to control the main gameplay flow.

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

* `READY`
* `PLAYING`
* `GAME_OVER`

The old `gameOver` boolean logic has been replaced by the `gameState` system.

### Next Step

**Step 21 — Improve Graphics**

The next goal is to improve the visual presentation of the game.

## 🗺️ Planned Roadmap

### Phase 5 — Game States & Replay

* [x] Restart / Replay functionality
* [x] Game states
* [ ] Start screen
* [ ] Game Over screen

### Phase 6 — Polish

* [ ] Improve graphics
* [ ] Add bird animation
* [ ] Add sound effects
* [ ] Add difficulty progression
* [ ] Add high-score system

### Phase 7 — Finalization

* [ ] Code cleanup
* [ ] Testing
* [ ] Bug fixing
* [ ] Final documentation

## 🎯 Learning Approach

This project is being developed step-by-step with a focus on understanding:

* Java classes and objects
* Swing components
* Game loops
* Timers and event handling
* Keyboard input
* 2D movement
* Collision detection
* Game states
* Score systems
* Clean project structure

## 🛠️ Technology

* Java
* Java Swing
* Git
* GitHub

## 📌 Development Tracker

Detailed step-by-step development progress is maintained in [`progress.md`](progress.md).
