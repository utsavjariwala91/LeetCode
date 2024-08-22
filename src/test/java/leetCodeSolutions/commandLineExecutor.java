package leetCodeSolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class commandLineExecutor {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            commandExecutor(input);
        } catch (IOException e) {
            e.getMessage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void commandExecutor(String cmd) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("bash", "-c", cmd);

        Process pr = pb.start();
        System.out.println(pr.pid());

        BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        System.out.println(br.readLine());
        int exitCode = pr.waitFor();
        System.out.println(exitCode);
    }
}
