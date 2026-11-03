package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import java.io.OutputStream;

public class MathParagraph implements IMathParagraph, r0g {
   private int n5;
   private boolean l6;
   private MathPortion k5;
   private final List<IMathBlock> u3;

   @Override
   public final int getJustification() {
      return this.n5;
   }

   @Override
   public final void setJustification(int value) {
      this.n5 = value;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.k5;
   }

   @Override
   public final int getCount() {
      return this.u3.size();
   }

   @Override
   public final IMathBlock get_Item(int index) {
      return this.u3.get_Item(index);
   }

   @Override
   public final void set_Item(int index, IMathBlock value) {
      if (!com.aspose.slides.ms.System.j8.l6(this.u3.get_Item(index), value)) {
         ((MathBlock)value).n5(this);
         ((MathBlock)this.u3.get_Item(index)).l6();
         this.u3.set_Item(index, value);
         this.k5();
      }
   }

   public MathParagraph() {
      this.u3 = new List<>();
      this.setJustification(4);
   }

   MathParagraph(MathPortion parent) {
      if (parent == null) {
         throw new ArgumentNullException("parent");
      }

      this.u3 = new List<>();
      this.setJustification(4);
      this.k5 = parent;
   }

   public MathParagraph(IMathBlock mathBlock) {
      if (mathBlock == null) {
         throw new ArgumentNullException(com.aspose.slides.ms.System.d1.n5("'{0}' value cannot be null", new Object[]{"mathBlock"}));
      }

      ((MathBlock)mathBlock).n5(this);
      this.u3 = new List<>();
      this.u3.addItem(mathBlock);
      this.setJustification(4);
   }

   @Override
   public final void clear() {
      List$Enumerator var1 = this.u3.iterator();

      try {
         while (var1.hasNext()) {
            MathBlock var2 = (MathBlock)var1.next();
            var2.l6();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.u3.clear();
      this.k5();
   }

   @Override
   public final void add(IMathBlock mathBlock) {
      ((MathBlock)mathBlock).n5(this);
      this.u3.addItem(mathBlock);
      this.k5();
   }

   @Override
   public final boolean remove(IMathBlock mathBlock) {
      boolean var2 = this.u3.removeItem(mathBlock);
      if (var2) {
         ((MathBlock)mathBlock).l6();
         this.k5();
      }

      return var2;
   }

   @Override
   public final boolean contains(IMathBlock mathBlock) {
      return this.u3.containsItem(mathBlock);
   }

   @Override
   public final int indexOf(IMathBlock mathBlock) {
      return this.u3.indexOf(mathBlock);
   }

   @Override
   public final void insert(int index, IMathBlock mathBlock) {
      this.u3.insertItem(index, mathBlock);

      try {
         ((MathBlock)mathBlock).n5(this);
         this.k5();
      } catch (RuntimeException var4) {
         this.u3.removeAt(index);
         throw var4;
      }
   }

   @Override
   public final void removeAt(int index) {
      IMathBlock var2 = this.u3.get_Item(index);
      this.u3.removeAt(index);
      ((MathBlock)var2).l6();
      this.k5();
   }

   final boolean n5() {
      return this.l6;
   }

   final void n5(boolean var1) {
      this.l6 = var1;
   }

   @Override
   public final IGenericEnumerator<IMathBlock> iterator() {
      return this.u3.iterator();
   }

   public final IEnumerator iteratorJava() {
      return this.u3.iteratorJava();
   }

   @Override
   public final void writeAsMathMl(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new MathParagraph$1(this, stream));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1) {
      s3w var2 = new s3w();
      var2.n5(this, var1);
   }

   @Override
   public final String toLatex() {
      r1b var1 = new r1b();
      return var1.n5(this);
   }

   final void l6() {
      this.setJustification(4);
      this.clear();
   }

   final void n5(MathPortion var1) {
      this.k5 = var1;
   }

   final void k5() {
      MathPortion var1 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_Immediate(), MathPortion.class);
      if (var1 != null) {
         var1.n5();
      }
   }
}
