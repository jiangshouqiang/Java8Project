package com.gr.jiang.streamtest;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by jiang on 2017/10/16.
 */
public class Streams {
    private enum Status{
        OPEN,CLOSED
    }

    private static final class Task{
        private final Status status;
        private final Integer points;

        private Task(Status status, Integer points) {
            this.status = status;
            this.points = points;
        }

        public Status getStatus() {
            return status;
        }

        public Integer getPoints() {
            return points;
        }
        @Override
        public String toString() {
            return String.format( "[%s, %d]", status, points );
        }
    }
    public static void main(String[] args){
        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.CLOSED,3),
                new Task(Status.OPEN,3423),
                new Task(Status.CLOSED,23)
        );
        final long totalPoints = tasks.stream().filter(task -> task.getStatus()==Status.CLOSED)
                .mapToInt(Task::getPoints)
                .sum();
        System.out.println("Total points : " + totalPoints);

        final double totalPoints2 = tasks
                .stream()
                .parallel()
                .map(task->task.getPoints())
                .reduce(0,Integer::sum);
        System.out.println("Total points (all tasks) : " + totalPoints2);
    }
}
