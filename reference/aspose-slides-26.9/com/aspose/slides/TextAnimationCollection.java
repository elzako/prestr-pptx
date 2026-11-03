package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class TextAnimationCollection implements ITextAnimationCollection {
   private final List<ITextAnimation> n5 = new List<>();

   final List<ITextAnimation> n5() {
      return this.n5;
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   final void n5(TextAnimation var1) {
      this.n5.addItem(var1);
   }

   public final TextAnimation add() {
      TextAnimation var1 = new TextAnimation();
      this.n5(var1);
      return var1;
   }

   @Override
   public final ITextAnimation get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final ITextAnimation[] get_Item(IShape shape) {
      List var2 = new List();
      IGenericEnumerator var3 = this.iterator();

      try {
         while (var3.hasNext()) {
            ITextAnimation var4 = (ITextAnimation)var3.next();
            if (((TextAnimation)var4).l6().a6() == shape) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (ITextAnimation[])var2.toArray(new ITextAnimation[0]);
   }

   @Override
   public final IGenericEnumerator<ITextAnimation> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ITextAnimation> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
