package org.apophysis;

public class HeadlessRendererTarget implements ThreadTarget {

    private boolean complete = false;
    private double currentProgress = 0.0;
    private String lastOutput = "";

    @Override
    public void message(int msg) {
        if (msg == Constants.WM_THREAD_COMPLETE) {
            complete = true;
            System.out.println("Headless rendering complete.");
        } else {
            System.out.println("Headless Target Message: " + msg);
        }
    }

    @Override
    public void progress(double value) {
        currentProgress = value;
        int percentage = (int) (value * 100);
        System.out.println("Rendering Progress: " + percentage + "%");
    }

    @Override
    public void output(String msg) {
        lastOutput = msg;
        System.out.println("Renderer Output: " + msg);
    }

    public boolean isComplete() {
        return complete;
    }

    public double getProgress() {
        return currentProgress;
    }
}
