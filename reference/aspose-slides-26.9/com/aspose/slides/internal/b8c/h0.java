package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;

public class h0 {
   private com.aspose.slides.ms.System.Xml.z9 n5;
   private o2 l6;
   private b4 k5;
   private x2 u3;
   private int a6 = 0;
   private String u9;

   public h0(com.aspose.slides.ms.System.Xml.z9 var1, o2 var2, b4 var3) {
      this(var1, var2, var3, new x2());
   }

   public h0(com.aspose.slides.ms.System.Xml.z9 var1, o2 var2, b4 var3, x2 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.u9 = var1.n5("http://www.w3.org/XML/1998/namespace");
   }

   protected final com.aspose.slides.ms.System.Xml.z9 n5() {
      return this.n5;
   }

   protected final o2 l6() {
      if (this.l6 == null) {
         this.l6 = new o2(this.n5);
      }

      return this.l6;
   }

   protected final b4 k5() {
      return this.k5;
   }

   protected final x2 u3() {
      return this.u3;
   }

   protected final boolean a6() {
      return this.a6 != 0;
   }

   protected final void n5(d0 var1, com.aspose.slides.ms.System.Xml.k6 var2, x4 var3) {
      if (var2.l6().length() != 0) {
         x4 var4 = var1.k5(var2);
         if (var4 != null) {
            if (var4 == var3) {
               return;
            }

            String var5 = "The global element '{0}' has already been declared.";
            if (com.aspose.slides.internal.v6g.k5.l6(var3, j7.class)) {
               String var6 = this.n5.n5(var2.n5());
               if (com.aspose.slides.ms.System.Xml.v8.n5(var6, this.u9)) {
                  a9 var7 = t5.h0();
                  x4 var8 = var7.y4().k5(var2);
                  if (var4 == var8) {
                     var1.l6(var2, var3);
                     return;
                  }

                  if (var3 == var8) {
                     return;
                  }
               } else if (this.n5(var4, var3, var1)) {
                  return;
               }

               var5 = "The attributeGroup '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, l2.class)) {
               String var9 = this.n5.n5(var2.n5());
               if (com.aspose.slides.ms.System.Xml.v8.n5(var9, this.u9)) {
                  a9 var10 = t5.h0();
                  x4 var11 = var10.n3().k5(var2);
                  if (var4 == var11) {
                     var1.l6(var2, var3);
                     return;
                  }

                  if (var3 == var11) {
                     return;
                  }
               }

               var5 = "The global attribute '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, u1s.class)) {
               if (this.k5(var4, var3, var1)) {
                  return;
               }

               var5 = "The simpleType '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, l9.class)) {
               if (this.k5(var4, var3, var1)) {
                  return;
               }

               var5 = "The complexType '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, f3.class)) {
               if (this.l6(var4, var3, var1)) {
                  return;
               }

               var5 = "The group '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, y3.class)) {
               var5 = "The notation '{0}' has already been declared.";
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, m2.class)) {
               var5 = "The identity constraint '{0}' has already been declared.";
            }

            this.n5(var5, var2.toString(), var3);
         } else {
            var1.n5(var2, var3);
         }
      }
   }

   private boolean n5(x4 var1, x4 var2, d0 var3) {
      j7 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, j7.class);
      j7 var5 = com.aspose.slides.internal.v6g.k5.n5(var1, j7.class);
      if (var5 == var4.s7()) {
         if (var5.c8().l6() == 0) {
            var3.l6(var4.h0(), var4);
            return true;
         }
      } else if (var5.s7() == var4) {
         return true;
      }

      return false;
   }

   private boolean l6(x4 var1, x4 var2, d0 var3) {
      f3 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, f3.class);
      f3 var5 = com.aspose.slides.internal.v6g.k5.n5(var1, f3.class);
      if (var5 == var4.c8()) {
         if (var5.h0() == null) {
            var3.l6(var4.u9(), var4);
            return true;
         }
      } else if (var5.c8() == var4) {
         return true;
      }

      return false;
   }

   private boolean k5(x4 var1, x4 var2, d0 var3) {
      j9e var4 = com.aspose.slides.internal.v6g.k5.n5(var2, j9e.class);
      j9e var5 = com.aspose.slides.internal.v6g.k5.n5(var1, j9e.class);
      if (var5 == var4.t1()) {
         if (var5.u6() == null) {
            var3.l6(var4.r4(), var4);
            return true;
         }
      } else if (var5.t1() == var4) {
         return true;
      }

      return false;
   }

   protected final void n5(String var1, x4 var2) {
      this.n5(new XmlSchemaException(var1, var2), 0);
   }

   protected final void n5(String var1, String var2, x4 var3) {
      this.n5(new XmlSchemaException(var1, var2, var3), 0);
   }

   protected final void n5(String var1, String var2, String var3, x4 var4) {
      this.n5(new XmlSchemaException(var1, new String[]{var2, var3}, var4), 0);
   }

   protected final void n5(String var1, String[] var2, RuntimeException var3, x4 var4) {
      this.n5(new XmlSchemaException(var1, var2, var3, var4.p8(), var4.d5(), var4.s3(), var4), 0);
   }

   protected final void n5(String var1, String var2, String var3, String var4, int var5, int var6) {
      this.n5(new XmlSchemaException(var1, new String[]{var2, var3}, var4, var5, var6), 0);
   }

   protected final void n5(String var1, x4 var2, int var3) {
      this.n5(new XmlSchemaException(var1, var2), var3);
   }

   protected final void n5(XmlSchemaException var1) {
      this.n5(var1, 0);
   }

   protected final void n5(String var1, String var2, x4 var3, int var4) {
      this.n5(new XmlSchemaException(var1, var2, var3), var4);
   }

   protected final void n5(XmlSchemaException var1, int var2) {
      if (var2 == 0) {
         this.a6++;
      }

      if (this.k5 != null) {
         this.k5.n5(null, new i0(var1, var2));
      } else if (var2 == 0) {
         throw var1;
      }
   }

   protected final void l6(XmlSchemaException var1, int var2) {
      if (var2 == 0) {
         this.a6++;
      }

      if (this.k5 != null) {
         this.k5.n5(null, new i0(var1, var2));
      }
   }
}
