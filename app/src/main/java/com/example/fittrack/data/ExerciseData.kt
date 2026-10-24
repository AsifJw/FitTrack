package com.example.fittrack.data

object ExerciseData {

    val categories = listOf("Strength", "Cardio", "Flexibility", "HIIT")

    val exercises = listOf(
        Exercise(
            id = 1,
            name = "Regular Push-ups",
            category = "Strength",
            difficulty = "Beginner",
            preview = "A strength workout that targets your chest, shoulders, and triceps",
            steps = listOf(
                "Find a flat surface",
                "Get on your knees and make sure your palms are facing forward",
                "Keep your elbows close to your body",
                "Keep your body straight and shoulders down",
                "Slowly push your chest close to the floor, and then back up"
            ),
            recommendedMinutes = 10
        ),

        Exercise (
            id = 2,
            name = "Pull-ups",
            category = "Strength",
            difficulty = "Intermediate",
            preview = "A strength workout that targets your back and arms",
            steps = listOf(
                "Find a bar",
                "Jump and grab the bar with both hands",
                "Hold on tight and keep your body steady",
                "Slowly pull yourself up, until your chin goes above the bar",
                "Then back down, and repeat"
                ),
            recommendedMinutes = 10
        ),

        Exercise (
            id = 3,
            name = "Bench Press",
            category = "Strength",
            difficulty = "Advanced",
            preview = "A strength workout that targets your chest",
            steps = listOf(
                "Find a bench with a bar and weights",
                "Adjust the weights, making sure its not too light or too heavy to lift",
                "Lay down flat on the bench underneath the bar",
                "Grab the bar slightly wider than shoulder width",
                "Press the weight up until your arms are straight, then back down in a controlled motion"
            ),
            recommendedMinutes = 15
        ),

        Exercise (
            id = 4,
            name = "Walking",
            category = "Cardio",
            difficulty = "Beginner",
            preview = "A light form of cardio",
            steps = listOf(
                "Set a goal for a certain amount of steps",
                "Go outside",
                "Walk for a while",
                "Take a break",
                "Walk again, and make sure to reach the goal"
            ),
            recommendedMinutes = 90
        ),

        Exercise (
            id = 5,
            name = "Running",
            category = "Cardio",
            difficulty = "Intermediate",
            preview = "Run for a few minutes",
            steps = listOf(
                "Set a goal for a certain amount of steps",
                "Go outside",
                "Run for a while",
                "Take a break, and stay hydrated",
                "Run again, and make sure to reach the goal"
            ),
            recommendedMinutes = 45
        ),

        Exercise (
            id = 6,
            name = "Swimming",
            category = "Cardio",
            difficulty = "Advanced",
            preview = "An advanced method of cardio",
            steps = listOf(
                "Find a body of water, preferably a pool",
                "Swim for a while",
                "Take a break",
                "Swim again"
            ),
            recommendedMinutes = 25
        ),


        Exercise (
            id = 7,
            name = "Child's pose",
            category = "Flexibility",
            difficulty = "Beginner",
            preview = "A resting pose that stretches the back, hips and thighs",
            steps = listOf(
                "Kneel on the floor, and knees hip-width apart",
                "Exhale and lay your torso down between your thighs",
                "Extend your arms forward, and make sure the palms are facing down",
                "Relax your neck, and breathe deeply into your lower back"
            ),
            recommendedMinutes = 5
        ),

        Exercise (
            id = 8,
            name = "Downward Dog",
            category = "Flexibility",
            difficulty = "Intermediate",
            preview = "A form of stretch that lengthens calves, hamstrings, and shoulders",
            steps = listOf(
                "Start on hands and knees, have your hands slightly wider than shoulder",
                "Tuck your toes, exhale, amd lift your knees off the floor",
                "Push your tailbone up toward the ceiling and press your chest toward your thighs",
                "Keep your knees slightly bent"
            ),
            recommendedMinutes = 5
        ),
        Exercise (
            id = 9,
            name = "Pigeon Pose",
            category = "Flexibility",
            difficulty = "Advanced",
            preview = "Targets glutes and hip fixers",
            steps = listOf(
                "Start from a push-up position, or on hands and knees",
                "Bring your right knee forward and behind the wrist of your right hand",
                "Angle your right foot towards your left hip, then slide your left leg straight back",
                "Incline your torso forward over your front leg, hold then switch sides"
            ),
            recommendedMinutes = 8
        ),

        Exercise (
            id = 10,
            name = "High knee",
            category = "HIIT",
            difficulty = "Beginner",
            preview = "Targets your hip flexors, and lower-body muscles",
            steps = listOf(
                "Find space",
                "Stand straight",
                "Drive your knees up and near hip height",
                "Repeat, altering sides almost mimicking a run but standing still"
            ),
            recommendedMinutes = 2
        ),

        Exercise (
            id = 11,
            name = "Mountain Climber",
            category = "HIIT",
            difficulty = "Intermediate",
            preview = "An intense workout that targets your core",
            steps = listOf(
                "Get into a high plank position",
                "Pull the knees up near the center of your chest, one knee at a time",
                "Repeat, and keep switching knees"
            ),
            recommendedMinutes = 2
        ),
        Exercise (
            id = 12,
            name = "Burpees",
            category = "HIIT",
            difficulty = "Advanced",
            preview = "Explosive full body workout that targets your entire body",
            steps = listOf(
                "Stand tall with your feet shoulder-width apart",
                "Push your hips back, bend your knees and get into a deep squat",
                "Kick your feet back into a plank and do push-ups",
                "Jump your feet back forward to your hands",
                "Explode upward into a vertical jump, and repeat"
            ),
            recommendedMinutes = 5
        )
    )
    fun getExercisesByCategory(category: String): List<Exercise> =
        exercises.filter { it.category == category }

    fun getExerciseById(id: Int): Exercise? =
        exercises.find { it.id == id }
    }

