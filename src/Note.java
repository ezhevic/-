import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Note
{
    public final List<String> notes = new ArrayList<String>();
    private final ReentrantReadWriteLock note = new ReentrantReadWriteLock();
    private final Lock read = note.readLock();
    private final Lock write = note.writeLock();

    public void addNote(int index, String note)
    {
        write.lock();
        System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
        notes.add(index, note);
        System.out.println("Уже добавлена заметка [" + note + "]");
        write.unlock();
    }

    public void removeNote(int index)
    {
        write.lock();
        System.out.println("Сейчас будет удалена заметка с позиции " + index);
        String note;
        note = notes.remove(index);
        System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        write.unlock();
    }

    public void readNote(int index)
    {
        read.lock();
        System.out.println("Сейчас будет прочтена заметка с позиции " + index);
        String note;
        note = notes.get(index);
        System.out.println("Прочтена заметка [" + note + "] с позиции " + index);
        read.unlock();
    }
}
