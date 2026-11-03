package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.w5;
import com.aspose.slides.ms.System.Xml.x5;
import java.util.Arrays;

public class p8 {
   private c8 n5;
   private s3 l6;

   public p8(com.aspose.slides.internal.z0k.t4 var1, boolean var2, String var3, o8 var4, String var5) {
      if (var1 == null) {
         throw new ArgumentNullException("inputStream");
      }

      this.n5 = new c8(true, var2);
      this.n5.setXmlResolver(var4);
      this.n5.load(i9.n5(var1, var4, var5));
      this.l6 = new s3(var3);
   }

   public p8(XmlDocument var1, boolean var2, String var3, o8 var4) {
      if (var1 == null) {
         throw new ArgumentNullException("document");
      }

      this.n5 = new c8(true, var2);
      this.n5.setXmlResolver(var4);
      this.n5.load(new x5(var1));
      this.l6 = new s3(var3);
   }

   public p8(i0 var1, boolean var2, String var3, o8 var4) {
      if (var1 == null) {
         throw new ArgumentNullException("nodeList");
      }

      XmlDocument var5 = i9.n5(var1);
      if (var5 == null) {
         throw new ArgumentException("nodeList");
      }

      this.n5 = new c8(false, var2);
      this.n5.setXmlResolver(var4);
      this.n5.load(new x5(var5));
      this.l6 = new s3(var3);
      n5(var1, var5, this.n5);
   }

   public final byte[] n5() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      this.n5.n5(var1, 0, this.l6);
      com.aspose.slides.internal.l7h.u6 var2 = new com.aspose.slides.internal.l7h.u6(false);
      return var2.u3(var1.toString());
   }

   public final byte[] n5(com.aspose.slides.internal.o8m.f2 var1) {
      this.n5.n5(var1, 0, this.l6);
      var1.n5(new byte[0], 0, 0);
      byte[] var2 = Arrays.copyOf(var1.n3(), var1.n3().length);
      var1.t2();
      return var2;
   }

   private static void n5(i0 var0, XmlDocument var1, XmlDocument var2) {
      x8 var3 = new x8();
      x8 var4 = new x8();
      var3.addItem(var1);
      var4.addItem(var2);
      int var5 = 0;

      do {
         l0 var6 = var3.n5(var5);
         l0 var7 = var4.n5(var5);
         i0 var8 = var6.getChildNodes();
         i0 var9 = var7.getChildNodes();

         for (int var10 = 0; var10 < var8.n5(); var10++) {
            var3.addItem(var8.k5(var10));
            var4.addItem(var9.k5(var10));
            if (i9.n5(var8.k5(var10), var0)) {
               n5(var9.k5(var10));
            }

            w5 var11 = var8.k5(var10).getAttributes();
            if (var11 != null) {
               for (int var12 = 0; var12 < var11.size(); var12++) {
                  if (i9.n5(var11.n5(var12), var0)) {
                     n5(var9.k5(var10).getAttributes().u3(var12));
                  }
               }
            }
         }
      } while (++var5 < var3.n5());
   }

   private static void n5(l0 var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, f2.class)) {
         ((f2)var0).n5(true);
      }
   }
}
