package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;

public class c8 {
   private v2 t2;
   private com.aspose.slides.ms.System.Xml.v0 s7;
   private com.aspose.slides.ms.System.Xml.z9 x8;
   private o2 n3;
   private com.aspose.slides.ms.System.Xml.o5 y4;
   private com.aspose.slides.ms.System.Xml.o8 e2;
   private com.aspose.slides.ms.System.r8 t9;
   protected x0 n5;
   protected com.aspose.slides.ms.System.Xml.s8 l6;
   protected com.aspose.slides.ms.System.Xml.k6 k5;
   protected x5 u3;
   protected com.aspose.slides.internal.l7h.a5 a6;
   protected String u9;
   protected boolean h0;
   protected boolean c8;

   public c8(c8 var1) {
      this.l6 = var1.l6;
      this.t2 = var1.t2;
      this.s7 = var1.s7;
      this.x8 = var1.x8;
      this.n3 = var1.n3;
      this.y4 = var1.y4;
      this.e2 = var1.e2;
      this.t9 = var1.t9;
      this.k5 = var1.k5;
   }

   public c8(com.aspose.slides.ms.System.Xml.s8 var1, v2 var2, com.aspose.slides.ms.System.Xml.v0 var3) {
      this.l6 = var1;
      this.t2 = var2;
      this.s7 = var3;
      this.x8 = var1.y1();
      this.y4 = com.aspose.slides.ms.System.Xml.o5.n5(var1);
      this.k5 = new com.aspose.slides.ms.System.Xml.k6();
   }

   public final com.aspose.slides.ms.System.Xml.s8 u3() {
      return this.l6;
   }

   public final v2 a6() {
      return this.t2;
   }

   public final com.aspose.slides.ms.System.Xml.z9 u9() {
      return this.x8;
   }

   public final o2 h0() {
      if (this.n3 != null) {
         return this.n3;
      }

      if (this.t2 != null) {
         this.n3 = this.t2.n5(this.x8);
      } else {
         this.n3 = new o2(this.x8);
      }

      return this.n3;
   }

   public final com.aspose.slides.ms.System.Xml.o5 c8() {
      return this.y4;
   }

   public final com.aspose.slides.ms.System.Xml.o8 t2() {
      return this.e2;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.o8 var1) {
      this.e2 = var1;
   }

   public final com.aspose.slides.ms.System.r8 s7() {
      return this.t9;
   }

   public final void n5(com.aspose.slides.ms.System.r8 var1) {
      this.t9 = var1;
   }

   public final b4 x8() {
      return (b4)this.s7.n5();
   }

   public final x0 n3() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.z7 var1) {
      x0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, x0.class);
      if (var2 == null) {
         throw new XmlException("An internal error has occurred.", com.aspose.slides.ms.System.d1.n5);
      }

      this.n5 = var2;
   }

   public boolean n5() {
      return false;
   }

   public void l6() {
   }

   public void k5() {
   }

   public Object n5(String var1) {
      return null;
   }

   public final void y4() {
      if (this.u3.k5) {
         if (this.u3.n5) {
            this.n5("Element '{0}' must have no character or element children.", v7u.n5(this.u3.s7, this.u3.x8));
            return;
         }

         z1 var1 = this.u3.c8.z1();
         int var2 = var1.l6();
         if (var2 == 2) {
            ArrayList var3 = var1.n5(this.u3, false);
            if (var3 == null) {
               this.n5("The element {0} cannot contain text.", v7u.l6(this.u3.s7, this.u3.x8));
            } else {
               this.n5(
                  "The element {0} cannot contain text. List of possible elements expected: {1}.",
                  new String[]{v7u.l6(this.u3.s7, this.u3.x8), v7u.l6(var3, false)}
               );
            }
         } else if (var2 == 1) {
            this.n5("The element cannot contain text. Content model is empty.", com.aspose.slides.ms.System.d1.n5);
         }

         if (this.c8) {
            this.k5(this.l6.z1());
         }
      }
   }

   public final void e2() {
      if (this.u3.k5) {
         int var1 = this.u3.c8.z1().l6();
         if (this.u3.n5) {
            this.n5("Element '{0}' must have no character or element children.", v7u.n5(this.u3.s7, this.u3.x8));
         }

         if (var1 == 1) {
            this.n5("The element cannot contain white space. Content model is empty.", com.aspose.slides.ms.System.d1.n5);
         }

         if (this.c8) {
            this.k5(this.l6.z1());
         }
      }
   }

   private void k5(String var1) {
      if (this.u9.length() == 0) {
         this.u9 = var1;
      } else {
         if (!this.h0) {
            this.a6.n5(this.u9);
            this.h0 = true;
         }

         this.a6.n5(var1);
      }
   }

   protected final void l6(String var1) {
      this.n5(var1, com.aspose.slides.ms.System.d1.n5);
   }

   protected final void n5(String var1, String[] var2) {
      this.n5(new XmlSchemaException(var1, var2, this.l6.q0(), this.y4.ah_(), this.y4.ai_()));
   }

   protected final void n5(String var1, String var2) {
      this.n5(new XmlSchemaException(var1, var2, this.l6.q0(), this.y4.ah_(), this.y4.ai_()));
   }

   protected final void n5(XmlSchemaException var1) {
      this.n5(var1, 0);
   }

   protected final void n5(String var1, String var2, int var3) {
      this.n5(new XmlSchemaException(var1, var2, this.l6.q0(), this.y4.ah_(), this.y4.ai_()), var3);
   }

   protected final void n5(String var1, String[] var2, int var3) {
      this.n5(new XmlSchemaException(var1, var2, this.l6.q0(), this.y4.ah_(), this.y4.ai_()), var3);
   }

   protected final void n5(XmlSchemaException var1, int var2) {
      if (this.s7 != null) {
         this.s7.n5(var1, var2);
      } else if (var2 == 0) {
         throw var1;
      }
   }

   protected static void n5(x0 var0, String var1, Object var2, b4 var3, String var4, int var5, int var6) {
      v6 var7 = null;
      XmlSchemaException var8 = null;
      v6[] var9 = new v6[]{var7};
      boolean var10 = !var0.t2().tryGetValue(new com.aspose.slides.ms.System.Xml.k6(var1), var9);
      var7 = var9[0];
      if (var10) {
         var8 = new XmlSchemaException("Reference to an undeclared entity, '{0}'.", var1, var4, var5, var6);
      } else if (var7.q0().k5()) {
         var8 = new XmlSchemaException("Reference to an unparsed entity, '{0}'.", var1, var4, var5, var6);
      }

      if (var8 != null) {
         if (var3 == null) {
            throw var8;
         }

         var3.n5(var2, new i0(var8));
      }
   }

   protected static void n5(x0 var0, String var1, com.aspose.slides.ms.System.Xml.v0 var2, String var3, int var4, int var5) {
      v6 var6 = null;
      String var7 = null;
      v6[] var8 = new v6[]{var6};
      boolean var9 = !var0.t2().tryGetValue(new com.aspose.slides.ms.System.Xml.k6(var1), var8);
      var6 = var8[0];
      if (var9) {
         var7 = "Reference to an undeclared entity, '{0}'.";
      } else if (var6.q0().k5()) {
         var7 = "Reference to an unparsed entity, '{0}'.";
      }

      if (var7 != null) {
         XmlSchemaException var10 = new XmlSchemaException(var7, var1, var3, var4, var5);
         if (var2 == null) {
            throw var10;
         }

         var2.n5(var10, 0);
      }
   }

   public static c8 n5(int var0, com.aspose.slides.ms.System.Xml.s8 var1, v2 var2, com.aspose.slides.ms.System.Xml.v0 var3, boolean var4) {
      switch (var0) {
         case 0:
            return new c8(var1, var2, var3);
         case 1:
            return new u3(var1, var2, var3);
         case 2:
            return new q1(var1, var3, var4);
         case 3:
            return new w0(var1, var2, var3);
         case 4:
            return new n9a(var1, var2, var3);
         default:
            return null;
      }
   }
}
