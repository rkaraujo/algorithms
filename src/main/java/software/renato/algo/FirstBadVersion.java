package software.renato.algo;

public class FirstBadVersion {

    private final VersionControl versionControl;

    public FirstBadVersion(VersionControl versionControl) {
        this.versionControl = versionControl;
    }

    public int firstBadVersion(int n) {
        int firstBadVersion = n;
        int lastGoodVersion = 0;

        int currentVersion = n / 2;
        while (currentVersion > lastGoodVersion && currentVersion < firstBadVersion) {
            boolean isBadVersion = versionControl.isBadVersion(currentVersion);
            if (isBadVersion) {
                firstBadVersion = currentVersion;
                currentVersion = currentVersion - ((currentVersion - lastGoodVersion) / 2);
            } else {
                lastGoodVersion = currentVersion;
                currentVersion = currentVersion + ((firstBadVersion - currentVersion) / 2);
            }
        }

        return firstBadVersion;
    }

    public interface VersionControl {
        boolean isBadVersion(int n);
    }
}
