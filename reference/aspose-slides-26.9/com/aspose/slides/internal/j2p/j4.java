package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.s2;

public class j4 {
   private ArrayList n5 = new ArrayList();

   public final void n5(g7 var1) {
      if (var1 != null) {
         this.n5.addItem(var1);
      }
   }

   public final int n5() {
      return this.n5.size();
   }

   public final g7 n5(int var1) {
      if (var1 >= this.n5.size()) {
         throw new ArgumentException("Index was out of range.  Must be non-negative and less than the size of the collection.", "index");
      } else {
         return (g7)this.n5.get_Item(var1);
      }
   }

   public final com.aspose.slides.internal.z0k.t4 n5(Object var1, com.aspose.slides.ms.System.y8 var2, o8 var3, String var4) {
      Object var5 = var1;
      IEnumerator var6 = this.n5.iterator();

      try {
         while (var6.hasNext()) {
            g7 var7 = (g7)var6.next();
            if (var5 == null || var7.n5(com.aspose.slides.ms.System.j8.n5(var5))) {
               var7.n5(var3);
               var7.n5(var4);
               var7.n5(var5);
               var5 = var7.t2();
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.z0k.t4.class)) {
               if (!var7.n5(com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class))) {
                  throw new CryptographicException("The input type was invalid for this transform.");
               }

               com.aspose.slides.internal.z0k.t4 var8 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.z0k.t4.class);
               XmlDocument var9 = new XmlDocument();
               var9.setPreserveWhitespace(true);
               c7 var10 = i9.n5(var8, var3, var4);
               var9.load(var10);
               var7.n5((Object)var9);
               var8.close();
               var5 = var7.t2();
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, i0.class)) {
               if (!var7.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class))) {
                  throw new CryptographicException("The input type was invalid for this transform.");
               }

               u3 var16 = new u3((i0)var5, var3, false);
               com.aspose.slides.internal.z0k.e2 var18 = new com.aspose.slides.internal.z0k.e2(var16.n5());
               var7.n5(var18);
               var5 = var7.t2();
               var18.close();
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(var5, XmlDocument.class)) {
                  throw new CryptographicException("The input type was invalid for this transform.");
               }

               if (!var7.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class))) {
                  throw new CryptographicException("The input type was invalid for this transform.");
               }

               u3 var17 = new u3((XmlDocument)var5, var3);
               com.aspose.slides.internal.z0k.e2 var19 = new com.aspose.slides.internal.z0k.e2(var17.n5());
               var7.n5(var19);
               var5 = var7.t2();
               var19.close();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            ((IDisposable)var6).dispose();
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.z0k.t4.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.z0k.t4.class);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var5, i0.class)) {
         u3 var15 = new u3((i0)var5, var3, false);
         return new com.aspose.slides.internal.z0k.e2(var15.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var5, XmlDocument.class)) {
         u3 var14 = new u3((XmlDocument)var5, var3);
         return new com.aspose.slides.internal.z0k.e2(var14.n5());
      } else {
         throw new CryptographicException("The input type was invalid for this transform.");
      }
   }

   public final com.aspose.slides.internal.z0k.t4 n5(com.aspose.slides.internal.z0k.t4 var1, o8 var2, String var3) {
      return this.n5(var1, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class), var2, var3);
   }

   public final com.aspose.slides.internal.z0k.t4 n5(XmlDocument var1, o8 var2, String var3) {
      return this.n5(var1, com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class), var2, var3);
   }

   public final m8 n5(XmlDocument var1, String var2) {
      m8 var3 = var1.createElement("Transforms", var2);
      IEnumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            if (var5 != null) {
               m8 var6 = var5.n5(var1);
               if (var6 != null) {
                  var3.appendChild(var6);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      return var3;
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      s2 var2 = new s2(var1.getOwnerDocument().getNameTable());
      var2.n5("ds", "http://www.w3.org/2000/09/xmldsig#");
      i0 var3 = var1.selectNodes("ds:Transform", var2);
      if (var3.n5() == 0) {
         throw new CryptographicException("Malformed element {0}.", "Transforms");
      }

      this.n5.clear();

      for (int var4 = 0; var4 < var3.n5(); var4++) {
         m8 var5 = (m8)var3.n5(var4);
         String var6 = i9.k5(var5, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
         g7 var7 = z3.n5(g7.class, var6);
         if (var7 == null) {
            throw new CryptographicException("Unknown transform has been encountered.");
         }

         var7.n5(var5.getChildNodes());
         this.n5.addItem(var7);
      }
   }
}
