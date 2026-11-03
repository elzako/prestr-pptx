package com.aspose.slides.internal.j2p;

import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.u8;

public class a6 extends u8 implements f2 {
   private boolean n5;

   public a6(String var1, String var2, String var3, XmlDocument var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.n5(var5);
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
      var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{" ", this.getName(), "=\""}));
      var1.n5(i9.h0(this.getValue()));
      var1.n5("\"");
   }

   @Override
   public final void n5(com.aspose.slides.internal.o8m.f2 var1, int var2, n5 var3) {
      com.aspose.slides.internal.l7h.u6 var4 = new com.aspose.slides.internal.l7h.u6(false);
      byte[] var5 = var4.u3(com.aspose.slides.ms.System.d1.n5(new String[]{" ", this.getName(), "=\""}));
      var1.n5(var5, 0, var5.length, var5, 0);
      var5 = var4.u3(i9.h0(this.getValue()));
      var1.n5(var5, 0, var5.length, var5, 0);
      var5 = var4.u3("\"");
      var1.n5(var5, 0, var5.length, var5, 0);
   }
}
