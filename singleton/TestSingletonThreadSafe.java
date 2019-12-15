package testsingletonthreadsafe;

import testsingletonthreadsafe.TaskGetTile;

class TestSingletonThreadSafe {
    public static void main(String[] args) {
        Runnable tsk1 = new TaskGetTile();
        Runnable tsk2 = new TaskGetTile();

        new Thread(tsk1).start();
        new Thread(tsk2).start();
    }
}