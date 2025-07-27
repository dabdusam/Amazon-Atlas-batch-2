// No package declaration if you're using default package

interface IProduct {
    void seeReviews();
    void getSample();
}

class Clothes implements IProduct {
    @Override
    public void seeReviews() {
        System.out.println("Showing reviews for Clothes.");
    }

    @Override
    public void getSample() {
        System.out.println("Showing sample Clothes.");
    }
}

class Books implements IProduct {
    @Override
    public void seeReviews() {
        System.out.println("Showing reviews for Books.");
    }

    @Override
    public void getSample() {
        System.out.println("Showing sample chapter from Book.");
    }
}

class Cupboard {
    private IProduct product;

    public Cupboard(IProduct product) {
        this.product = product;
    }

    public void addProductToCupboard() {
        product.getSample();
        product.seeReviews();
    }
}

public class Day21task05 {
    public static void main(String[] args) {
        IProduct clothes = new Clothes();
        Cupboard clothesCupboard = new Cupboard(clothes);
        System.out.println("== Clothes in Cupboard ==");
        clothesCupboard.addProductToCupboard();

        System.out.println();

        IProduct books = new Books();
        Cupboard booksCupboard = new Cupboard(books);
        System.out.println("== Books in Cupboard ==");
        booksCupboard.addProductToCupboard();
    }
}
