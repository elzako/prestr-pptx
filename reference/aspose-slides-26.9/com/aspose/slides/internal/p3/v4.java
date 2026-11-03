package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public abstract class v4 extends List<com.aspose.slides.internal.r4.u9> implements com.aspose.slides.internal.r4.u9 {
   public int k5 = -1;

   public v4() {
   }

   public v4(List<com.aspose.slides.internal.r4.u9> var1) {
      super(var1);
   }

   public void t2() {
   }

   public abstract v4 h0();

   public abstract boolean n5(v4 var1);

   public abstract boolean n5(v4 var1, boolean var2, z1 var3);

   public abstract boolean l6(v4 var1);

   public final boolean k5(v4 var1) {
      if (!this.l6(var1)) {
         this.h0();
         return false;
      } else {
         return true;
      }
   }

   public final boolean l6(v4 var1, boolean var2, z1 var3) {
      if (!this.n5(var1, var2, var3)) {
         this.h0();
         return false;
      } else {
         return true;
      }
   }

   public final void n5(y2 var1) {
      for (com.aspose.slides.internal.r4.u9 var3 : this) {
         v0 var4 = (v0)var3;
         var4.n5(var1.n5(new f0(var1, var4.k7())));
      }
   }

   public final v0 s7() {
      return this.size() == 0 ? null : (v0)super.get_Item(this.size() - 1);
   }

   public final com.aspose.slides.internal.r4.u9 x8() {
      if (this.size() == 0) {
         return null;
      }

      com.aspose.slides.internal.r4.u9 var1 = (com.aspose.slides.internal.r4.u9)super.get_Item(this.size() - 1);
      super.removeAt(this.size() - 1);
      return var1;
   }

   public final v0 n5(int var1) {
      return var1 < this.size() && var1 >= 0 ? (v0)super.get_Item(var1) : null;
   }

   public final int l6(int var1) {
      if (this.size() != 0 && var1 >= 0 && var1 < this.size()) {
         v0 var2 = null;
         int var3 = var1;

         for (int var4 = this.size(); var3 < var4; var3++) {
            var2 = this.n5(var3);
            if (var2.e2()) {
               break;
            }
         }

         if (var3 == var1) {
            return var1;
         } else {
            return var2 != null && var2.e2() ? var3 - 1 : var1;
         }
      } else {
         return -1;
      }
   }

   public abstract boolean c8();

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("<KnuthSequence [");

      for (int var2 = 0; var2 < this.size(); var2++) {
         var1.n5(this.get_Item(var2));
         if (var2 != this.size() - 1) {
            var1.n5(", ");
         }
      }

      var1.n5("]>");
      return var1.toString();
   }

   @Override
   public final v0 n5() {
      return null;
   }

   @Override
   public final v4 l6() {
      return this;
   }

   @Override
   public final boolean k5() {
      return false;
   }

   @Override
   public final boolean u3() {
      return true;
   }
}
