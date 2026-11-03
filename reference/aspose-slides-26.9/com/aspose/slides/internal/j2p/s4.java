package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.k1;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.s2;

public class s4 extends g7 {
   private com.aspose.slides.ms.System.y8[] l6 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class),
      com.aspose.slides.internal.v6g.k5.n5(i0.class),
      com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)
   };
   private com.aspose.slides.ms.System.y8[] k5 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(i0.class), com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)
   };
   private i0 u3;
   private boolean a6 = false;
   private s2 u9 = null;
   private XmlDocument h0 = null;
   private int c8 = 0;

   public final void n5(int var1) {
      this.c8 = var1;
   }

   public s4() {
      this.l6("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
   }

   @Override
   public com.aspose.slides.ms.System.y8[] h0() {
      return this.l6;
   }

   @Override
   public void n5(i0 var1) {
      if (var1 != null && var1.n5() > 0) {
         throw new CryptographicException("Unknown transform has been encountered.");
      }
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
         this.l6((XmlDocument)var1);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1) {
      XmlDocument var2 = new XmlDocument();
      var2.setPreserveWhitespace(true);
      o8 var3 = this.u9() ? this.n5 : new k1();
      c7 var4 = i9.n5(var1, var3, this.n5());
      var2.load(var4);
      this.h0 = var2;
      if (this.h0 == null) {
         throw new CryptographicException("An XmlDocument context is required for enveloped transforms.");
      }

      this.u9 = new s2(this.h0.getNameTable());
      this.u9.n5("dsig", "http://www.w3.org/2000/09/xmldsig#");
   }

   private void l6(i0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("nodeList");
      }

      this.h0 = i9.n5(var1);
      if (this.h0 == null) {
         throw new CryptographicException("An XmlDocument context is required for enveloped transforms.");
      }

      this.u9 = new s2(this.h0.getNameTable());
      this.u9.n5("dsig", "http://www.w3.org/2000/09/xmldsig#");
      this.u3 = var1;
   }

   private void l6(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentNullException("doc");
      }

      this.h0 = var1;
      this.u9 = new s2(this.h0.getNameTable());
      this.u9.n5("dsig", "http://www.w3.org/2000/09/xmldsig#");
   }

   @Override
   public Object t2() {
      if (this.h0 == null) {
         throw new CryptographicException("An XmlDocument context is required for enveloped transforms.");
      }

      if (this.u3 == null) {
         i0 var20 = this.h0.selectNodes("//dsig:Signature", this.u9);
         if (var20 == null) {
            return this.h0;
         } else if (var20.n5() >= this.c8 && this.c8 > 0) {
            var20.k5(this.c8 - 1).getParentNode().removeChild(var20.k5(this.c8 - 1));
            return this.h0;
         } else {
            return this.h0;
         }
      } else {
         if (this.c8 == 0) {
            return this.u3;
         }

         i0 var1 = this.h0.selectNodes("//dsig:Signature", this.u9);
         if (var1 == null) {
            return this.u3;
         }

         x8 var2 = new x8();
         IEnumerator var3 = this.u3.iterator();

         try {
            while (var3.hasNext()) {
               l0 var4 = (l0)var3.next();
               if (var4 != null) {
                  if (!i9.l6(var4) && !i9.n5(var4)) {
                     try {
                        l0 var5 = var4.selectSingleNode("ancestor-or-self::dsig:Signature[1]", this.u9);
                        int var6 = 0;
                        IEnumerator var7 = var1.iterator();

                        try {
                           while (var7.hasNext()) {
                              l0 var8 = (l0)var7.next();
                              var6++;
                              if (var8 == var5) {
                                 break;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                              ((IDisposable)var7).dispose();
                           }
                        }

                        if (var5 == null || var5 != null && var6 != this.c8) {
                           var2.addItem(var4);
                        }
                     } catch (RuntimeException var18) {
                     }
                  } else {
                     var2.addItem(var4);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }

         return var2;
      }
   }

   @Override
   public Object l6(com.aspose.slides.ms.System.y8 var1) {
      if (var1 != com.aspose.slides.internal.v6g.k5.n5(i0.class) && !var1.n5(com.aspose.slides.internal.v6g.k5.n5(i0.class))) {
         if (var1 != com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class) && !var1.n5(com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class))) {
            throw new ArgumentException("The input type was invalid for this transform.", "type");
         } else if (this.u3 != null) {
            throw new ArgumentException("The input type was invalid for this transform.", "type");
         } else {
            return (XmlDocument)this.t2();
         }
      } else {
         if (this.u3 == null) {
            this.u3 = i9.n5(this.h0, true);
         }

         return (i0)this.t2();
      }
   }
}
