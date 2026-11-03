package com.aspose.slides.internal.t6q;

import com.aspose.slides.ms.System.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public final class n3 implements n5, a5<n3> {
   private boolean n5;

   public n3(boolean var1) {
      this.n5(var1);
   }

   public n3() {
      this(false);
   }

   public final boolean l6() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public final String n5() {
      return d1.n5("<?{0} end='{1}'?>",new Object[]{ "xpacket", this.l6() ? "w" : "r"});
   }

   public final boolean n5(n3 var1) {
      return var1 == null ? false : com.aspose.slides.ms.System.n3.l6(this.l6(), var1.l6());
   }

   @Override
   public boolean equals(Object other) {
      if (other == null) {
         return false;
      } else if (j8.l6(this, other)) {
         return true;
      } else {
         return j8.n5(this) != j8.n5(other) ? false : this.n5(com.aspose.slides.internal.v6g.k5.n5(other, n3.class));
      }
   }

   @Override
   public int hashCode() {
      String var1 = d1.n5(new Object[]{"XMpTrailer", this.l6()});
      return var1.hashCode();
   }
}
