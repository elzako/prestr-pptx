package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public final class TableFormat extends DomObject<Table> implements ITableFormat, q1v {
   private IPresentationComponent n5;
   private long l6;
   private final FillFormat k5 = new FillFormat(this);
   private u3l u3;

   TableFormat(Table table) {
      super(table);
   }

   @Override
   public final IFillFormat getFillFormat() {
      return this.k5;
   }

   @Override
   public final float getTransparency() {
      this.u3();
      return this.k5();
   }

   @Override
   public final void setTransparency(float value) {
      if (!(value < 0.0F) && !(value > 1.0F)) {
         this.u3();
         this.n5(value);
      } else {
         throw new ArgumentException("Value should be defined in the range [0..1].");
      }
   }

   @Override
   public final ITableFormatEffectiveData getEffective() {
      return this.l6();
   }

   final Table n5() {
      return this.u9;
   }

   @Override
   public final long getVersion() {
      return (this.l6 & 4294967295L) + (this.u9.x8().getVersion() & 4294967295L) & 4294967295L;
   }

   final u3l l6() {
      if (this.u3 == null) {
         this.u3 = new u3l(this);
      }

      this.u3.n5(u3l.class);
      return this.u3;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.n5 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.n5};
         d0u.n5(IPresentationComponent.class, this.u9, var1);
         this.n5 = var1[0];
      }

      return this.n5;
   }

   private void n5(float var1) {
      IGenericEnumerator var2 = this.n5().getRows().iterator();

      try {
         while (var2.hasNext()) {
            IRow var3 = (IRow)var2.next();
            IGenericEnumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  ICell var5 = (ICell)var4.next();
                  var5.getCellFormat().setTransparency(var1);
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

   private float k5() {
      com.aspose.slides.ms.System.o5 var1 = null;
      IGenericEnumerator var2 = this.n5().getRows().iterator();

      try {
         while (var2.hasNext()) {
            IRow var3 = (IRow)var2.next();
            IGenericEnumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  ICell var5 = (ICell)var4.next();
                  if (com.aspose.slides.ms.System.o5.n5(var1, null)) {
                     var1 = new com.aspose.slides.ms.System.o5<>(var5.getCellFormat().getTransparency());
                  } else if (com.aspose.slides.ms.System.o5.l6(var1, new com.aspose.slides.ms.System.o5<>(var5.getCellFormat().getTransparency()))) {
                     return Float.NaN;
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

      return var1 != null && var1.l6() ? (Float)var1.n5() : Float.NaN;
   }

   private void u3() {
      IGenericEnumerator var1 = this.n5().getRows().iterator();

      try {
         while (var1.hasNext()) {
            IRow var2 = (IRow)var1.next();
            IGenericEnumerator var3 = var2.iterator();

            try {
               while (var3.hasNext()) {
                  ICell var4 = (ICell)var3.next();
                  if (!((CellFormat)var4.getCellFormat()).h0()) {
                     throw new InvalidOperationException("Transparency can only be set or retrieved when FillType is Solid for all cells.");
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }
}
