package com.aspose.slides.internal.z5;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.n2d.s7;

public class l6 {
   private c8 n5;
   private boolean l6 = true;
   private com.aspose.slides.internal.u3.l6 k5;
   private String u3;

   public l6() {
      this.n5 = new c8();
      this.k5 = t2();
   }

   @Deprecated
   public final t2 n5() {
      if (this.n5.a6() == null) {
         throw new InvalidOperationException("PageSetup.AnyPage is not defined.");
      } else {
         return this.n5.a6().n5();
      }
   }

   @Deprecated
   public final u3 l6() {
      if (this.n5.a6() == null) {
         throw new InvalidOperationException("PageSetup.AnyPage is not defined.");
      } else {
         return this.n5.a6().l6();
      }
   }

   public final boolean k5() {
      return this.l6;
   }

   public final a6 u3() {
      return this.n5.n5();
   }

   public final boolean a6() {
      return this.n5.l6();
   }

   public final String u9() {
      return this.u3;
   }

   public final c8 h0() {
      return this.n5;
   }

   public final com.aspose.slides.internal.u3.l6 c8() {
      return this.k5;
   }

   private static com.aspose.slides.internal.u3.l6 t2() {
      com.aspose.slides.internal.u3.l6 var0 = new com.aspose.slides.internal.u3.l6();
      var0.n5(7);
      var0.n5(s7.n5().u3());
      var0.l6(var0.k5().u3());
      var0.l6(var0.k5().l6() >= var0.k5().k5() ? 1 : 0);
      return var0;
   }
}
