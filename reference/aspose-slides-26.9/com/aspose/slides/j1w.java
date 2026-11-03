package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

abstract class j1w {
   private final Dictionary<Byte, h2d> n5;
   private final int l6;
   private final int k5;
   private final h5p u3;

   protected j1w(Dictionary<Byte, h2d> var1, int var2, h5p var3) {
      if (var1 == null) {
         throw new ArgumentNullException("textString");
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var2 + 1;
      this.u3 = var3;
   }

   public final y2t l6() {
      return new y2t(this.n5(), this.u9(), this.a6(), this.h0(), this.c8());
   }

   protected final Dictionary<Byte, h2d> k5() {
      return this.n5;
   }

   protected final h5p u3() {
      return this.u3;
   }

   protected abstract String n5();

   protected String a6() {
      q8l var1 = this.x8();
      return var1 != null ? var1.n5().n5().toString() : "";
   }

   protected String u9() {
      q8l var1 = this.s7();
      return var1 != null ? var1.n5().n5().toString() : "";
   }

   protected String h0() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      int var2 = this.t2();
      if (this.u3().h0().containsKey(var2)) {
         c3j var3 = this.u3().h0().get_Item(var2);
         if (!this.u3().c8().containsKey(var3.n5())) {
            return "";
         }

         var1.n5((Object)(this.u3().c8().get_Item(var3.n5())));
      }

      return var1.toString();
   }

   protected String c8() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      int var2 = this.t2();
      if (this.u3().t2().containsKey(var2)) {
         c3j var3 = this.u3().t2().get_Item(var2);
         if (!this.u3().s7().containsKey(var3.n5())) {
            return "";
         }

         var1.n5((Object)(this.u3().s7().get_Item(var3.n5())));
      }

      return var1.toString();
   }

   public final int t2() {
      return this.k5;
   }

   protected final q8l s7() {
      if (this.u3().k5().containsKey(this.t2())) {
         int var1 = this.u3().k5().get_Item(this.t2()).n5();
         if (this.u3().a6().containsKey(var1)) {
            c3j var2 = this.u3().a6().get_Item(var1);
            if (!this.u3().u9().containsKey(var2.n5())) {
               return null;
            }

            return this.u3().u9().get_Item(var2.n5());
         }
      }

      return null;
   }

   protected final q8l x8() {
      if (this.u3().k5().containsKey(this.t2())) {
         c3j var1 = this.u3().k5().get_Item(this.t2());
         return !this.u3().u3().containsKey(var1.n5()) ? null : this.u3().u3().get_Item(var1.n5());
      } else {
         return null;
      }
   }
}
