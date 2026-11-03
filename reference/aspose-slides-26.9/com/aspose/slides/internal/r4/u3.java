package com.aspose.slides.internal.r4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

public class u3<T> implements h0<T>, y4<T> {
   private List<T> n5;
   private int l6 = 0;
   private int k5 = -1;

   public u3(List<T> var1) {
      this.n5 = var1;
   }

   public u3(List<T> var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void n5() {
      if (this.l6 > 0) {
         this.n5.removeAt(this.k5);
         this.k5 = -1;
         this.l6--;
      } else {
         throw new InvalidOperationException();
      }
   }

   @Override
   public final void n5(T var1) {
      this.n5.set_Item(this.l6 - 1, (T)var1);
   }

   @Override
   public final void l6(T var1) {
      this.n5.insertItem(this.l6++, (T)var1);
   }

   @Override
   public final boolean l6() {
      return this.n5 != null && this.l6 < this.n5.size();
   }

   @Override
   public final T k5() {
      if (this.l6 < this.n5.size()) {
         this.k5 = this.l6;
         return this.n5.get_Item(this.l6++);
      } else {
         throw new InvalidOperationException();
      }
   }

   @Override
   public final boolean u3() {
      return this.l6 > 0;
   }

   @Override
   public final T a6() {
      if (this.l6 <= 0) {
         throw new InvalidOperationException();
      }

      this.k5 = this.l6 - 1;
      return this.n5.get_Item(--this.l6);
   }

   @Override
   public final int u9() {
      return this.l6;
   }

   @Override
   public final int h0() {
      return this.l6 - 1;
   }
}
