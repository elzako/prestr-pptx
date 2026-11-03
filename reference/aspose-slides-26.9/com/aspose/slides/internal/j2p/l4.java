package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.d3;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.k3;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.w4;

public class l4 extends g7 {
   private com.aspose.slides.ms.System.y8[] l6 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class),
      com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class),
      com.aspose.slides.internal.v6g.k5.n5(i0.class)
   };
   private com.aspose.slides.ms.System.y8[] k5 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
   };
   private i0 u3;
   private String a6;
   private com.aspose.slides.internal.z0k.t4 u9;
   private boolean h0 = false;

   public l4() {
      this.l6("http://www.w3.org/TR/1999/REC-xslt-19991116");
   }

   @Override
   public com.aspose.slides.ms.System.y8[] h0() {
      return this.l6;
   }

   @Override
   public void n5(i0 var1) {
      if (var1 == null) {
         throw new CryptographicException("Unknown transform has been encountered.");
      }

      m8 var2 = null;
      int var3 = 0;
      IEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            l0 var5 = (l0)var4.next();
            if (!com.aspose.slides.internal.v6g.k5.l6(var5, d3.class)) {
               if (com.aspose.slides.internal.v6g.k5.l6(var5, m8.class)) {
                  if (var3 != 0) {
                     throw new CryptographicException("Unknown transform has been encountered.");
                  }

                  var2 = com.aspose.slides.internal.v6g.k5.n5(var5, m8.class);
                  var3++;
               } else {
                  var3++;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      if (var3 == 1 && var2 != null) {
         this.u3 = var1;
         this.a6 = com.aspose.slides.ms.System.d1.k5(var2.getOuterXml(), (char[])null);
      } else {
         throw new CryptographicException("Unknown transform has been encountered.");
      }
   }

   @Override
   protected i0 c8() {
      return this.u3;
   }

   @Override
   public void n5(Object var1) {
      if (this.u9 != null) {
         this.u9.close();
      }

      this.u9 = new com.aspose.slides.internal.z0k.e2();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.t4.class)) {
         this.u9 = (com.aspose.slides.internal.z0k.t4)var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, i0.class)) {
         u3 var2 = new u3((i0)var1, null, this.h0);
         byte[] var3 = var2.n5();
         if (var3 == null) {
            return;
         }

         this.u9.write(var3, 0, var3.length);
         this.u9.flush();
         this.u9.setPosition(0L);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, XmlDocument.class)) {
         u3 var4 = new u3((XmlDocument)var1, null, this.h0);
         byte[] var5 = var4.n5();
         if (var5 == null) {
            return;
         }

         this.u9.write(var5, 0, var5.length);
         this.u9.flush();
         this.u9.setPosition(0L);
      }
   }

   @Override
   public Object t2() {
      o8 var1 = this.a6();
      com.aspose.slides.internal.k4s.k5 var2 = new com.aspose.slides.internal.k4s.k5();
      w4 var3 = new w4();
      var3.n5((o8)null);
      var3.l6(i9.n5);
      var3.n5(0L);
      com.aspose.slides.internal.z0k.w1 var4 = new com.aspose.slides.internal.z0k.w1(this.a6);

      try {
         c7 var5 = c7.n5(var4, var3, (String)null);
         var2.n5(var5, var1);
         c7 var6 = c7.n5(this.u9, var3, this.n5());
         com.aspose.slides.internal.x6s.l6 var7 = new com.aspose.slides.internal.x6s.l6(var6, 2);
         com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();
         k3 var9 = new k3(var8, null);
         var2.n5(var7, null, var9);
         var8.setPosition(0L);
         return var8;
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   @Override
   public Object l6(com.aspose.slides.ms.System.y8 var1) {
      if (var1 != com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
         && !var1.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class))) {
         throw new ArgumentException("The input type was invalid for this transform.", "type");
      } else {
         return (com.aspose.slides.internal.z0k.t4)this.t2();
      }
   }
}
