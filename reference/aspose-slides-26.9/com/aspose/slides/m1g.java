package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class m1g {
   private final BaseSlide n5;
   private final com.aspose.slides.internal.k4y.q9k l6;
   private long k5;
   private final Dictionary<Integer, Shape> u3 = new Dictionary<>();

   public m1g(BaseSlide var1, com.aspose.slides.internal.k4y.q9k var2) {
      if (var1 == null) {
         throw new ArgumentNullException("slide");
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = (this.c8() & 4294967295L) + 1L & 4294967295L;
   }

   public final BaseSlide n5() {
      return this.n5;
   }

   public final boolean l6() {
      return com.aspose.slides.internal.v6g.k5.l6(this.n5, Slide.class);
   }

   public final boolean k5() {
      return com.aspose.slides.internal.v6g.k5.l6(this.n5, LayoutSlide.class);
   }

   public final boolean u3() {
      return com.aspose.slides.internal.v6g.k5.l6(this.n5, MasterSlide.class);
   }

   public final boolean a6() {
      return com.aspose.slides.internal.v6g.k5.l6(this.n5, MasterHandoutSlide.class);
   }

   public final Dictionary<Integer, Shape> u9() {
      return this.u3;
   }

   public final long h0() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final Shape n5(byte var1) {
      if (this.u3() || this.a6()) {
         return null;
      } else if (this.k5()) {
         LayoutSlide var3 = (LayoutSlide)this.n5();
         return ((BaseSlide)var3.getMasterSlide()).n5(var1);
      } else if (this.l6()) {
         Slide var2 = (Slide)this.n5();
         return ((BaseSlide)var2.getLayoutSlide()).n5(var1);
      } else {
         throw new InvalidOperationException();
      }
   }

   public final long c8() {
      if (this.u3() || this.a6()) {
         return 0L;
      } else if (this.k5()) {
         LayoutSlide var2 = (LayoutSlide)this.n5();
         return this.l6((BaseSlide)var2.getMasterSlide());
      } else if (this.l6()) {
         Slide var1 = (Slide)this.n5();
         return this.l6((BaseSlide)var1.getLayoutSlide());
      } else {
         throw new InvalidOperationException();
      }
   }

   private List<Shape> n5(BaseSlide var1) {
      List var2 = new List();
      List var3 = var1.c8();
      List$Enumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            Shape var5 = (Shape)var4.next();
            Placeholder var6 = (Placeholder)var5.getPlaceholder();
            if (var6 != null) {
               var2.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2;
   }

   private long l6(BaseSlide var1) {
      List var2 = this.n5(var1);
      return this.n5(var2);
   }

   private long n5(List<Shape> var1) {
      long var2 = 0L;
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            Shape var5 = (Shape)var4.next();
            if ((var5.getPlaceholder().getIndex() & 4294967295L) > (var2 & 4294967295L)) {
               var2 = var5.getPlaceholder().getIndex();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2;
   }
}
