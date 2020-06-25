package cn.neyzoter.designpattern.factory;
/**
 * 抽象工厂模式
 * @author Charles Song
 * @date 2020-6-25
 */
public class AbstractFactory {
    public static void main (String[] args) {
        ComputerFactory cf = new IntelFactory();
        System.out.println("Intel cpu mem : " + cf.makeCpu().getMem());
        System.out.println("Intel MainBoard version : " + cf.makeMainBoard().getVersion());
    }
}

class IntelFactory implements ComputerFactory{
    @Override
    public Cpu makeCpu () {
        Cpu cpu =  new IntelCpu();
        cpu.setMem(16);
        return cpu;
    }
    @Override
    public MainBoard makeMainBoard () {
        MainBoard mb = new IntelMainBoard();
        mb.setVersion(10);
        return mb;
    }
}

class AmdFactory  implements ComputerFactory{
    @Override
    public Cpu makeCpu () {
        Cpu cpu =  new AmdCpu();
        cpu.setMem(16);
        return cpu;
    }
    @Override
    public MainBoard makeMainBoard () {
        MainBoard mb = new AmdMainBoard();
        mb.setVersion(10);
        return mb;
    }
}

interface ComputerFactory {
    Cpu makeCpu ();
    MainBoard makeMainBoard ();
}


interface Cpu {
    int getMem();
    int setMem(int m);
}

interface MainBoard {
    int getVersion();
    int setVersion(int v);
}

class IntelCpu implements Cpu {
    int mem;

    @Override
    public int getMem() {
        return this.mem;
    }

    @Override
    public int setMem(int m) {
        return this.mem = m;
    }
}

class AmdCpu implements Cpu {
    int mem;

    @Override
    public int getMem() {
        return this.mem;
    }

    @Override
    public int setMem(int m) {
        return this.mem = m;
    }
}

class IntelMainBoard implements MainBoard {
    int version;

    @Override
    public int getVersion() {
        return this.version;
    }

    @Override
    public int setVersion(int v) {
        return this.version = v;
    }
}

class AmdMainBoard implements MainBoard {
    int version;

    @Override
    public int getVersion() {
        return this.version;
    }

    @Override
    public int setVersion(int v) {
        return this.version = v;
    }
}