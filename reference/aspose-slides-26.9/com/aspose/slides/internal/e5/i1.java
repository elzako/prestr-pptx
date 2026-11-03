package com.aspose.slides.internal.e5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.t0;

public abstract class i1 extends t2 implements com.aspose.slides.internal.v3.h0 {
   private com.aspose.slides.internal.w2.k5 u3 = null;
   protected m8 a6;
   protected XmlDocument u9;
   protected String h0;
   private static final Dictionary<String, String> c8 = new Dictionary<>();

   public i1(t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, w1 var4) {
      this.n5(var2);
      this.h0 = var1;
      this.u3 = var3;
   }

   public final XmlDocument h0() {
      return this.u9;
   }

   public com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.j5 var1, String var2) {
      return com.aspose.slides.internal.o9b.w1.n5;
   }

   public final com.aspose.slides.internal.f2.k5 j5() {
      return null;
   }

   @Override
   public String z1() {
      return this.h0;
   }

   public final void n5(XmlDocument var1, m8 var2) {
      this.u9 = var1;
      this.a6 = var1.createElement(this.h0, this.q0());
      n5(this.a6, this.u3);
      this.u3 = null;
      var2.appendChild(this.a6);
   }

   private static void n5(m8 var0, com.aspose.slides.internal.w2.k5 var1) {
      for (int var2 = 0; var2 < var1.e2(); var2++) {
         String var3 = var1.x8(var2);
         String var4 = var1.s7(var2);
         int var5 = d1.c8(var4, ":");
         if (var5 == -1) {
            var0.k5(var4, var3);
         } else {
            String var6 = com.aspose.slides.internal.v3.x8.n5(var4, 0, var5);
            String var7 = d1.k5(var4, var5 + 1);
            if (d1.a6(var6, "xmlns")) {
               c8.addItem(var7, var3);
            } else {
               String var8 = null;
               String[] var9 = new String[]{var8};
               c8.tryGetValue(var6, var9);
               var8 = var9[0];
               var0.n5(var7, var8, var3);
            }
         }
      }
   }

   public final void l6(XmlDocument var1, m8 var2) {
      n5(this.a6, this.u3);
   }

   public final XmlDocument w1() {
      this.u9 = null;
      this.a6 = null;

      try {
         this.u9 = new XmlDocument();
         m8 var1 = this.u9.createElement(this.h0, this.q0());
         this.u9.appendChild(var1);
         this.a6 = this.u9.getDocumentElement();
         this.l6(this.u9, this.a6);
         if (!this.a6.u9("xmlns", "http://www.w3.org/2000/xmlns/")) {
            this.a6.n5("xmlns", "http://www.w3.org/2000/xmlns/", this.q0());
         }

         this.a6.k5("xmlns:xlink", "http://www.w3.org/1999/xlink");
      } catch (RuntimeException var2) {
      }

      return this.u9;
   }

   @Override
   public void n5(t2 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, i1.class)) {
         ((i1)var1).n5(this.u9, this.a6);
      }
   }

   @Override
   public void l6(char[] var1, int var2, int var3, w1 var4, com.aspose.slides.internal.w2.u9 var5) {
      super.l6(var1, var2, var3, var4, var5);
      String var6 = d1.n5(var1, var2, var3);
      t0 var7 = this.u9.createTextNode(var6);
      this.a6.appendChild(var7);
   }

   static {
      c8.addItem("xlink", "http://www.w3.org/1999/xlink");
   }
}
