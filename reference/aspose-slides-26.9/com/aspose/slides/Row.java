package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

public final class Row extends CellCollection implements IRow {
   int l6 = -1;
   double k5 = 0.0;
   List<ICell> u3 = new List<>();
   private double u9;
   private double h0;
   boolean a6 = false;
   private RowFormat c8;

   Row(RowCollection parentImmediate, double height) {
      super(parentImmediate);
      this.u9 = height;
      this.h0 = this.u9;
      this.c8 = new RowFormat(this);
   }

   @Override
   public final double getHeight() {
      this.n5().n5().k5(false);
      return this.h0;
   }

   @Override
   public final double getMinimalHeight() {
      return this.u9;
   }

   @Override
   public final void setMinimalHeight(double value) {
      if (!com.aspose.slides.ms.System.d2.l6(value)) {
         this.u9 = value;
      } else {
         this.u9 = 0.0;
      }

      if (this.u9 != this.h0) {
         this.t2();
      }
   }

   @Override
   public final void setTextFormat(IPortionFormat source) {
      List$Enumerator var2 = this.u3.iterator();

      try {
         while (var2.hasNext()) {
            Cell var3 = (Cell)var2.next();
            IGenericEnumerator var4 = var3.getTextFrame().getParagraphs().iterator();

            try {
               while (var4.hasNext()) {
                  Paragraph var5 = (Paragraph)var4.next();
                  IGenericEnumerator var6 = var5.getPortions().iterator();

                  try {
                     while (var6.hasNext()) {
                        Portion var7 = (Portion)var6.next();
                        ((PortionFormat)var7.getPortionFormat()).l6((BasePortionFormat)source);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void setTextFormat(IParagraphFormat source) {
      List$Enumerator var2 = this.u3.iterator();

      try {
         while (var2.hasNext()) {
            Cell var3 = (Cell)var2.next();
            IGenericEnumerator var4 = var3.getTextFrame().getParagraphs().iterator();

            try {
               while (var4.hasNext()) {
                  Paragraph var5 = (Paragraph)var4.next();
                  ((ParagraphFormat)var5.getParagraphFormat()).n5(source);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void setTextFormat(ITextFrameFormat source) {
      List$Enumerator var2 = this.u3.iterator();

      try {
         while (var2.hasNext()) {
            Cell var3 = (Cell)var2.next();
            ((TextFrameFormat)var3.getTextFrame().getTextFrameFormat()).l6(source);
            var3.n5(source);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final IRowFormat getRowFormat() {
      return this.c8;
   }

   final RowCollection u9() {
      return com.aspose.slides.internal.v6g.k5.n5(this.getParent_Immediate(), RowCollection.class);
   }

   final int h0() {
      this.u9().a6();
      return this.l6;
   }

   final double c8() {
      this.u9().u9();
      return this.k5;
   }

   @Override
   Table n5() {
      return this.u9().n5();
   }

   @Override
   int l6() {
      return this.u3.size();
   }

   final void l6(int var1) {
      if (this.u3.size() < var1) {
         this.n5(-1, var1 - this.u3.size());
      }
   }

   final void n5(int var1, int var2) {
      if (var2 >= 1) {
         int var3 = var2;
         if (var1 >= 0 && var1 < this.size()) {
            int var6 = var1;

            while (var3 > 0) {
               var3--;
               Cell var5 = new Cell(this, (Column)this.u9().k5.get_Item(var6));
               this.u3.insertItem(var6++, var5);
            }
         } else {
            while (var3 > 0) {
               var3--;
               Cell var4 = new Cell(this, (Column)this.u9().k5.get_Item(this.u3.size()));
               this.u3.addItem(var4);
               var4.getTextFrame().setText("");
            }
         }

         this.n5().z1();
      }
   }

   @Override
   Cell n5(int var1) {
      return var1 >= 0 && var1 < this.size() ? (Cell)this.u3.get_Item(var1) : null;
   }

   final void l6(int var1, int var2) {
      int var3 = var1;

      for (int var4 = 0; var4 < var2; var4++) {
         Cell var5 = this.n5(var3++);
         if (var5 == null) {
            throw new NullReferenceException("Cell couldn't be empty.");
         }

         var5.y4();
      }

      this.u3.removeRange(var1, var2);
      this.n5().z1();
   }

   @Override
   IGenericEnumerator<ICell> k5() {
      return new com.aspose.slides.internal.n8e.f5<>(this.u3.iterator().Clone(), n5, null);
   }

   @Override
   IGenericEnumerator<ICell> u3() {
      return new com.aspose.slides.internal.n8e.j3<>(this.u3.iteratorJava().Clone(), n5, null);
   }

   @Override
   void n5(com.aspose.slides.ms.System.u3 var1, int var2) {
      if (this.size() >= 1) {
         this.u3.copyTo(var1, var2);
      }
   }

   final void n5(double var1) {
      if (this.h0 != var1) {
         this.u9().n5 = false;
      }

      this.h0 = var1;
   }

   final void t2() {
      if (!this.a6) {
         this.a6 = true;
         int var1 = 0;

         while (var1 < this.size()) {
            if (this.n5(var1) == null) {
               throw new NullReferenceException("Cell couldn't be empty.");
            }

            Cell var2 = this.n5(var1).a6();
            var2.e2();
            var1 += var2.getColSpan();
         }

         this.n5().z1();
      }
   }
}
