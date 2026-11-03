package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.o5;

public class t9 extends n5 implements m1 {
   private String l6;
   private String[] k5;
   private o5 u3 = null;

   public t9(com.aspose.slides.internal.z7.n5 var1) {
      this(var1.h0());
   }

   public t9(String var1) {
      this.l6 = var1;
      this.k5 = new String[]{var1};
   }

   @Override
   public final String[] u3() {
      return this.k5;
   }

   @Override
   public final boolean k5() {
      return true;
   }

   @Override
   public final void n5(String var1, List<o5> var2) {
      this.u3 = (o5)var2.get_Item(0);
   }

   @Override
   public String a6() {
      return "Destination";
   }
}
