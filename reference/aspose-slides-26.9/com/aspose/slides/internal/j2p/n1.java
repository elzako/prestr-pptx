package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;

public class n1 extends g7 {
   private com.aspose.slides.ms.System.y8[] l6 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class),
      com.aspose.slides.internal.v6g.k5.n5(i0.class),
      com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)
   };
   private com.aspose.slides.ms.System.y8[] k5 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
   };
   private com.aspose.slides.internal.o8m.e2 u3 = null;

   public n1() {
      this.l6("http://www.w3.org/2000/09/xmldsig#base64");
   }

   @Override
   public com.aspose.slides.ms.System.y8[] h0() {
      return this.l6;
   }

   @Override
   public void n5(i0 var1) {
   }

   @Override
   protected i0 c8() {
      return null;
   }

   @Override
   public void n5(Object var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.t4.class)) {
         this.n5((com.aspose.slides.internal.z0k.t4)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, i0.class)) {
         this.l6((i0)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, XmlDocument.class)) {
         this.l6(((XmlDocument)var1).selectNodes("//."));
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentException("obj");
      }

      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();
      byte[] var3 = new byte[1024];

      int var4;
      do {
         var4 = var1.read(var3, 0, 1024);
         if (var4 > 0) {
            int var5 = 0;
            int var6 = 0;

            while (var6 < var4 && !com.aspose.slides.ms.System.t9.t9((char)(var3[var6] & 0xFF))) {
               var6++;
            }

            var5 = var6++;

            while (var6 < var4) {
               if (!com.aspose.slides.ms.System.t9.t9((char)(var3[var6] & 0xFF))) {
                  var3[var5] = var3[var6];
                  var5++;
               }

               var6++;
            }

            var2.write(var3, 0, var5);
         }
      } while (var4 > 0);

      var2.setPosition(0L);
      this.u3 = new com.aspose.slides.internal.o8m.e2(var2, new com.aspose.slides.internal.o8m.c4(), 0);
   }

   private void l6(i0 var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      IEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            l0 var4 = (l0)var3.next();
            l0 var5 = var4.selectSingleNode("self::text()");
            if (var5 != null) {
               var2.n5(var5.getOuterXml());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      com.aspose.slides.internal.l7h.u6 var11 = new com.aspose.slides.internal.l7h.u6(false);
      byte[] var12 = var11.u3(var2.toString());
      int var6 = 0;
      int var7 = 0;

      while (var7 < var12.length && !com.aspose.slides.ms.System.t9.t9((char)(var12[var7] & 0xFF))) {
         var7++;
      }

      var6 = var7++;

      while (var7 < var12.length) {
         if (!com.aspose.slides.ms.System.t9.t9((char)(var12[var7] & 0xFF))) {
            var12[var6] = var12[var7];
            var6++;
         }

         var7++;
      }

      com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2(var12, 0, var6);
      this.u3 = new com.aspose.slides.internal.o8m.e2(var8, new com.aspose.slides.internal.o8m.c4(), 0);
   }

   @Override
   public Object t2() {
      return this.u3;
   }

   @Override
   public Object l6(com.aspose.slides.ms.System.y8 var1) {
      if (var1 != com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
         && !var1.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class))) {
         throw new ArgumentException("The input type was invalid for this transform.", "type");
      } else {
         return this.u3;
      }
   }
}
