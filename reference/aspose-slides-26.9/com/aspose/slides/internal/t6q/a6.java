package com.aspose.slides.internal.t6q;

import com.aspose.slides.ms.System.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public final class a6 implements n5, a5<a6> {
   private String n5;

   public a6() {
   }

   public a6(String var1) {
      this.n5(var1);
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public final String n5() {
      return d1.n5("<?{0} begin=\"{1}\" id=\"{2}\" ?>",new Object[]{ "xpacket", "\ufeff", this.l6()});
   }

   public final boolean n5(a6 var1) {
      if (var1 == null) {
         return false;
      } else if (j8.l6(this.l6(), var1.l6())) {
         return true;
      } else if (d1.n5(this.l6()) && d1.n5(var1.l6())) {
         return true;
      } else {
         return !d1.n5(this.l6()) && !d1.n5(var1.l6()) ? d1.u3(this.l6(), var1.l6(), (short)5) : false;
      }
   }

   @Override
   public boolean equals(Object other) {
      return other == null ? false : this.n5(com.aspose.slides.internal.v6g.k5.n5(other, a6.class));
   }

   @Override
   public int hashCode() {
      int var1 = 13 + "XmpHeader".hashCode();
      if (this.l6() != null) {
         var1 += d1.u9(this.l6()).hashCode();
      }

      return var1;
   }
}
