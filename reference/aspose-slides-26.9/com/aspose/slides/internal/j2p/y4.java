package com.aspose.slides.internal.j2p;

import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.n8;

public class y4 extends n8 implements f2 {
   private boolean n5;

   public y4(String var1, XmlDocument var2, boolean var3) {
      super(var1, var2);
      this.n5 = var3;
   }

   public final boolean n5() {
      return this.n5;
   }

   @Override
   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(com.aspose.slides.internal.l7h.a5 var1, int var2, n5 var3) {
      if (this.n5() && var2 == 1) {
         var1.n5(i9.u3(this.getValue()));
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.o8m.f2 var1, int var2, n5 var3) {
      if (this.n5() && var2 == 1) {
         com.aspose.slides.internal.l7h.u6 var4 = new com.aspose.slides.internal.l7h.u6(false);
         byte[] var5 = var4.u3(i9.u3(this.getValue()));
         var1.n5(var5, 0, var5.length, var5, 0);
      }
   }
}
