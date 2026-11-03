package com.aspose.slides.ms.System.Xml;

public final class q0 extends com.aspose.slides.internal.x6s.a6 implements h2 {
   private XmlDocument a6;
   private l0 u9;
   private int h0;
   private m8 c8;

   public q0(XmlDocument var1, l0 var2) {
      this.a6 = var1;
      this.n5(var2);
   }

   public q0(q0 var1) {
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5() {
      return new q0(this);
   }

   @Override
   public z9 l6() {
      return this.a6.getNameTable();
   }

   @Override
   public int k5() {
      this.a0();
      return this.u9.getXPNodeType();
   }

   @Override
   public String u3() {
      return this.u9.getXPLocalName();
   }

   @Override
   public String a6() {
      u8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.u9, u8.class);
      return var1 != null && var1.h0() ? com.aspose.slides.ms.System.d1.n5 : this.u9.getNamespaceURI();
   }

   @Override
   public String u9() {
      switch (this.u9.getNodeType()) {
         case 1:
         case 7:
            return this.u9.getName();
         case 2:
            if (((u8)this.u9).h0()) {
               String var1 = this.u9.getLocalName();
               if (v8.n5(var1, this.a6.strXmlns)) {
                  return com.aspose.slides.ms.System.d1.n5;
               }

               return var1;
            }

            return this.u9.getName();
         default:
            return com.aspose.slides.ms.System.d1.n5;
      }
   }

   @Override
   public String h0() {
      u8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.u9, u8.class);
      return var1 != null && var1.h0() ? com.aspose.slides.ms.System.d1.n5 : this.u9.getPrefix();
   }

   @Override
   public String c8() {
      switch (this.u9.getNodeType()) {
         case 1:
         case 11:
            return this.u9.getInnerText();
         case 2:
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 12:
         default:
            return this.u9.getValue();
         case 3:
         case 4:
         case 13:
         case 14:
            return this.y1();
         case 9:
            return this.y2();
      }
   }

   private String y2() {
      m8 var1 = this.a6.getDocumentElement();
      return var1 != null ? var1.getInnerText() : com.aspose.slides.ms.System.d1.n5;
   }

   private String y1() {
      this.a0();
      String var1 = this.u9.getValue();
      l0 var2 = this.c8(this.u9);
      if (var2 != null && var2.isText()) {
         com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5(var1);

         do {
            var3.n5(var2.getValue());
            var2 = this.c8(var2);
         } while (var2 != null && var2.isText());

         var1 = var3.toString();
      }

      return var1;
   }

   @Override
   public String t2() {
      return this.u9.getBaseURI();
   }

   @Override
   public boolean s7() {
      m8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.u9, m8.class);
      return var1 != null ? var1.t2() : false;
   }

   @Override
   public String x8() {
      return this.u9.getXmlLang();
   }

   @Override
   public Object n3() {
      this.a0();
      return this.u9;
   }

   @Override
   public boolean y4() {
      m8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.u9, m8.class);
      if (var1 != null && var1.s7()) {
         w5 var2 = var1.getAttributes();

         for (int var3 = 0; var3 < var2.l6(); var3++) {
            u8 var4 = var2.n5(var3);
            if (!var4.h0()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public String n5(String var1, String var2) {
      return this.u9.getXPAttribute(var1, var2);
   }

   @Override
   public boolean l6(String var1, String var2) {
      m8 var3 = com.aspose.slides.internal.v6g.k5.n5(this.u9, m8.class);
      if (var3 != null && var3.s7()) {
         w5 var4 = var3.getAttributes();

         for (int var5 = 0; var5 < var4.l6(); var5++) {
            u8 var6 = var4.n5(var5);
            if (com.aspose.slides.ms.System.d1.a6(var6.getLocalName(), var1) && com.aspose.slides.ms.System.d1.a6(var6.getNamespaceURI(), var2)) {
               if (!var6.h0()) {
                  this.u9 = var6;
                  this.h0 = var5;
                  return true;
               }

               return false;
            }
         }
      }

      return false;
   }

   @Override
   public boolean e2() {
      m8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.u9, m8.class);
      if (var1 != null && var1.s7()) {
         w5 var2 = var1.getAttributes();

         for (int var3 = 0; var3 < var2.l6(); var3++) {
            u8 var4 = var2.n5(var3);
            if (!var4.h0()) {
               this.u9 = var4;
               this.h0 = var3;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean t9() {
      u8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.u9, u8.class);
      if (var1 != null && !var1.h0()) {
         w5 var2 = null;
         w5[] var3 = new w5[]{var2};
         int[] var4 = new int[]{this.h0};
         boolean var5 = !n5(var1, var3, var4[0]) && !n5(var1, var3[0], var4);
         var2 = var3[0];
         this.h0 = var4[0];
         if (var5) {
            return false;
         }

         for (int var6 = this.h0 + 1; var6 < var2.l6(); var6++) {
            var1 = var2.n5(var6);
            if (!var1.h0()) {
               this.u9 = var1;
               this.h0 = var6;
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean k5(String var1) {
      if (com.aspose.slides.ms.System.d1.a6(var1, this.a6.strXmlns)) {
         return false;
      }

      m8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.u9, m8.class);
      if (var2 != null) {
         String var3;
         if (var1 != null && var1.length() != 0) {
            var3 = var1;
         } else {
            var3 = this.a6.strXmlns;
         }

         String var4 = this.a6.strReservedXmlns;

         do {
            u8 var5 = var2.a6(var3, var4);
            if (var5 != null) {
               this.c8 = (m8)this.u9;
               this.u9 = var5;
               return true;
            }

            var2 = com.aspose.slides.internal.v6g.k5.n5(var2.getParentNode(), m8.class);
         } while (var2 != null);

         if (com.aspose.slides.ms.System.d1.a6(var1, this.a6.strXml)) {
            this.c8 = (m8)this.u9;
            this.u9 = this.a6.getNamespaceXml();
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean l6(int var1) {
      m8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.u9, m8.class);
      if (var2 == null) {
         return false;
      }

      int var3 = Integer.MAX_VALUE;
      switch (var1) {
         case 0:
            w5 var15 = var2.getAttributes();
            w5[] var18 = new w5[]{var15};
            int[] var20 = new int[]{Integer.MAX_VALUE};
            boolean var21 = !n5(var18, var20);
            var15 = var18[0];
            var3 = var20[0];
            if (var21) {
               this.u9 = this.a6.getNamespaceXml();
            } else {
               this.u9 = var15.n5(var3);
               this.h0 = var3;
            }

            this.c8 = var2;
            break;
         case 1:
            w5 var13 = var2.getAttributes();
            w5[] var17 = new w5[]{var13};
            int[] var19 = new int[]{Integer.MAX_VALUE};
            boolean var7 = !n5(var17, var19);
            var13 = var17[0];
            var3 = var19[0];
            if (var7) {
               return false;
            }

            u8 var8;
            for (var8 = var13.n5(var3); v8.n5(var8.getLocalName(), this.a6.strXml); var8 = var13.n5(var3)) {
               var17[0] = var13;
               var19[0] = var3;
               boolean var9 = !l6(var17, var19);
               var13 = var17[0];
               var3 = var19[0];
               if (var9) {
                  return false;
               }
            }

            this.u9 = var8;
            this.h0 = var3;
            this.c8 = var2;
            break;
         case 2:
            if (!var2.s7()) {
               return false;
            }

            w5 var4 = var2.getAttributes();
            int[] var5 = new int[]{Integer.MAX_VALUE};
            boolean var6 = !n5(var4, var5);
            var3 = var5[0];
            if (var6) {
               return false;
            }

            this.u9 = var4.n5(var3);
            this.h0 = var3;
            this.c8 = var2;
            break;
         default:
            return false;
      }

      return true;
   }

   private static boolean n5(w5 var0, int[] var1) {
      for (int var2 = var0.l6() - 1; var2 >= 0; var2--) {
         u8 var3 = var0.n5(var2);
         if (var3.h0()) {
            var1[0] = var2;
            return true;
         }
      }

      return false;
   }

   private static boolean n5(w5[] var0, int[] var1) {
      if (n5(var0[0], var1)) {
         return true;
      }

      for (m8 var2 = com.aspose.slides.internal.v6g.k5.n5(var0[0].n5.getParentNode(), m8.class);
         var2 != null;
         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.getParentNode(), m8.class)
      ) {
         if (var2.s7()) {
            var0[0] = var2.getAttributes();
            if (n5(var0[0], var1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean k5(int var1) {
      u8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.u9, u8.class);
      if (var2 != null && var2.h0()) {
         w5 var3 = null;
         int var4 = this.h0;
         w5[] var5 = new w5[]{var3};
         int[] var6 = new int[]{var4};
         boolean var7 = !n5(var2, var5, var6[0]) && !n5(var2, var5[0], var6);
         var3 = var5[0];
         var4 = var6[0];
         if (var7) {
            return false;
         }

         switch (var1) {
            case 0:
               do {
                  var5[0] = var3;
                  var6[0] = var4;
                  boolean var16 = !l6(var5, var6);
                  var3 = var5[0];
                  var4 = var6[0];
                  if (var16) {
                     if (this.n5(null, this.c8, this.a6.strXml)) {
                        return false;
                     }

                     this.u9 = this.a6.getNamespaceXml();
                     return true;
                  }

                  var2 = var3.n5(var4);
               } while (this.n5(var2.u9(), this.c8, var2.getLocalName()));

               this.u9 = var2;
               this.h0 = var4;
               break;
            case 1:
               String var15;
               do {
                  var5[0] = var3;
                  var6[0] = var4;
                  boolean var9 = !l6(var5, var6);
                  var3 = var5[0];
                  var4 = var6[0];
                  if (var9) {
                     return false;
                  }

                  var2 = var3.n5(var4);
                  var15 = var2.getLocalName();
               } while (this.n5(var2.u9(), this.c8, var15) || v8.n5(var15, this.a6.strXml));

               this.u9 = var2;
               this.h0 = var4;
               break;
            case 2:
               if (var2.u9() != this.c8) {
                  return false;
               }

               var6[0] = var4;
               boolean var8 = !l6(var3, var6);
               var4 = var6[0];
               if (var8) {
                  return false;
               }

               this.u9 = var3.n5(var4);
               this.h0 = var4;
               break;
            default:
               return false;
         }

         return true;
      } else {
         return false;
      }
   }

   private static boolean l6(w5 var0, int[] var1) {
      for (int var2 = var1[0] - 1; var2 >= 0; var2--) {
         u8 var3 = var0.n5(var2);
         if (var3.h0()) {
            var1[0] = var2;
            return true;
         }
      }

      return false;
   }

   private static boolean l6(w5[] var0, int[] var1) {
      if (l6(var0[0], var1)) {
         return true;
      }

      for (m8 var2 = com.aspose.slides.internal.v6g.k5.n5(var0[0].n5.getParentNode(), m8.class);
         var2 != null;
         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.getParentNode(), m8.class)
      ) {
         if (var2.s7()) {
            var0[0] = var2.getAttributes();
            if (n5(var0[0], var1)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean n5(m8 var1, m8 var2, String var3) {
      String var4 = this.a6.strReservedXmlns;

      while (var2 != null && var2 != var1) {
         u8 var5 = var2.a6(var3, var4);
         if (var5 != null) {
            return true;
         }

         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.getParentNode(), m8.class);
      }

      return false;
   }

   @Override
   public String n5(String var1) {
      String var2 = super.n5(var1);
      if (var2 != null) {
         var2 = this.l6().n5(var2);
      }

      return var2;
   }

   @Override
   public boolean z1() {
      l0 var1 = this.c8(this.u9);
      if (var1 == null) {
         return false;
      }

      if (var1.isText() && this.u9.isText()) {
         var1 = this.c8(this.s7(var1));
         if (var1 == null) {
            return false;
         }
      }

      l0 var2 = this.u3(var1);

      while (!a6(var2, var1)) {
         var1 = this.c8(var1);
         if (var1 == null) {
            return false;
         }
      }

      this.u9 = var1;
      return true;
   }

   @Override
   public boolean t4() {
      l0 var1;
      switch (this.u9.getNodeType()) {
         case 1:
            var1 = this.u9(this.u9);
            if (var1 == null) {
               return false;
            }
            break;
         case 9:
         case 11:
            var1 = this.u9(this.u9);
            if (var1 == null) {
               return false;
            }

            while (!a6(this.u9, var1)) {
               var1 = this.c8(var1);
               if (var1 == null) {
                  return false;
               }
            }
            break;
         default:
            return false;
      }

      this.u9 = var1;
      return true;
   }

   @Override
   public boolean q0() {
      l0 var1 = this.u3(this.u9);
      if (var1 != null) {
         this.u9 = var1;
         return true;
      }

      u8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.u9, u8.class);
      if (var2 != null) {
         var1 = var2.h0() ? this.c8 : var2.u9();
         if (var1 != null) {
            this.u9 = var1;
            this.c8 = null;
            return true;
         }
      }

      return false;
   }

   @Override
   public void z3() {
      while (true) {
         l0 var1;
         var1 = this.u9.getParentNode();
         label20:
         if (var1 == null) {
            u8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.u9, u8.class);
            if (var2 != null) {
               var1 = var2.h0() ? this.c8 : var2.u9();
               if (var1 != null) {
                  break label20;
               }
            }

            this.c8 = null;
            return;
         }

         this.u9 = var1;
      }
   }

   @Override
   public boolean n5(com.aspose.slides.internal.x6s.a6 var1) {
      q0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, q0.class);
      if (var2 != null && this.a6 == var2.a6) {
         this.u9 = var2.u9;
         this.h0 = var2.h0;
         this.c8 = var2.c8;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean u3(String var1) {
      m8 var2 = this.a6.getElementById(var1);
      if (var2 != null) {
         this.u9 = var2;
         this.c8 = null;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean k5(String var1, String var2) {
      if (this.u9.getNodeType() == 2) {
         return false;
      }

      l0 var3 = this.u9(this.u9);
      if (var3 != null) {
         do {
            if (var3.getNodeType() == 1
               && com.aspose.slides.ms.System.d1.a6(var3.getLocalName(), var1)
               && com.aspose.slides.ms.System.d1.a6(var3.getNamespaceURI(), var2)) {
               this.u9 = var3;
               return true;
            }

            var3 = this.c8(var3);
         } while (var3 != null);
      }

      return false;
   }

   @Override
   public boolean u3(int var1) {
      if (this.u9.getNodeType() == 2) {
         return false;
      }

      l0 var2 = this.u9(this.u9);
      if (var2 != null) {
         int var3 = h0(var1);
         if (var3 == 0) {
            return false;
         }

         do {
            if ((1 << var2.getXPNodeType() & var3) != 0) {
               this.u9 = var2;
               return true;
            }

            var2 = this.c8(var2);
         } while (var2 != null);
      }

      return false;
   }

   @Override
   public boolean n5(String var1, String var2, com.aspose.slides.internal.x6s.a6 var3) {
      l0 var4 = null;
      q0 var5 = com.aspose.slides.internal.v6g.k5.n5(var3, q0.class);
      if (var5 != null) {
         if (this.a6 != var5.a6) {
            return false;
         }

         switch (var5.u9.getNodeType()) {
            case 2:
               var5 = (q0)var5.n5();
               if (!var5.w1()) {
                  return false;
               }
            default:
               var4 = var5.u9;
         }
      }

      l0 var6 = this.u9;
      if (var6.getNodeType() == 2) {
         var6 = ((u8)var6).u9();
         if (var6 == null) {
            return false;
         }
      }

      do {
         l0 var7 = var6.getFirstChild();
         if (var7 != null) {
            var6 = var7;
         } else {
            while (true) {
               l0 var8 = var6.getNextSibling();
               if (var8 != null) {
                  var6 = var8;
                  break;
               }

               l0 var9 = var6.getParentNode();
               if (var9 == null) {
                  return false;
               }

               var6 = var9;
            }
         }

         if (var6 == var4) {
            return false;
         }
      } while (
         var6.getNodeType() != 1
            || !com.aspose.slides.ms.System.d1.a6(var6.getLocalName(), var1)
            || !com.aspose.slides.ms.System.d1.a6(var6.getNamespaceURI(), var2)
      );

      this.u9 = var6;
      return true;
   }

   @Override
   public boolean n5(int var1, com.aspose.slides.internal.x6s.a6 var2) {
      l0 var3 = null;
      q0 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, q0.class);
      if (var4 != null) {
         if (this.a6 != var4.a6) {
            return false;
         }

         switch (var4.u9.getNodeType()) {
            case 2:
               var4 = (q0)var4.n5();
               if (!var4.w1()) {
                  return false;
               }
            default:
               var3 = var4.u9;
         }
      }

      int var5 = h0(var1);
      if (var5 == 0) {
         return false;
      }

      l0 var6 = this.u9;
      switch (var6.getNodeType()) {
         case 2:
            var6 = ((u8)var6).u9();
            if (var6 == null) {
               return false;
            }
            break;
         case 3:
         case 4:
         case 13:
         case 14:
            var6 = this.s7(var6);
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
      }

      do {
         l0 var7 = var6.getFirstChild();
         if (var7 != null) {
            var6 = var7;
         } else {
            while (true) {
               l0 var8 = var6.getNextSibling();
               if (var8 != null) {
                  var6 = var8;
                  break;
               }

               l0 var9 = var6.getParentNode();
               if (var9 == null) {
                  return false;
               }

               var6 = var9;
            }
         }

         if (var6 == var3) {
            return false;
         }
      } while ((1 << var6.getXPNodeType() & var5) == 0);

      this.u9 = var6;
      return true;
   }

   @Override
   public boolean u3(String var1, String var2) {
      l0 var3 = this.c8(this.u9);
      if (var3 == null) {
         return false;
      }

      while (
         var3.getNodeType() != 1
            || !com.aspose.slides.ms.System.d1.a6(var3.getLocalName(), var1)
            || !com.aspose.slides.ms.System.d1.a6(var3.getNamespaceURI(), var2)
      ) {
         var3 = this.c8(var3);
         if (var3 == null) {
            return false;
         }
      }

      this.u9 = var3;
      return true;
   }

   @Override
   public boolean a6(int var1) {
      l0 var2 = this.c8(this.u9);
      if (var2 == null) {
         return false;
      }

      if (var2.isText() && this.u9.isText()) {
         var2 = this.c8(this.s7(var2));
         if (var2 == null) {
            return false;
         }
      }

      int var3 = h0(var1);
      if (var3 == 0) {
         return false;
      }

      while ((1 << var2.getXPNodeType() & var3) == 0) {
         var2 = this.c8(var2);
         if (var2 == null) {
            return false;
         }
      }

      this.u9 = var2;
      return true;
   }

   @Override
   public boolean m1() {
      switch (this.u9.getNodeType()) {
         case 1:
            l0 var2 = this.u9(this.u9);
            if (var2 == null) {
               return false;
            }

            return true;
         case 9:
         case 11:
            l0 var1 = this.u9(this.u9);
            if (var1 == null) {
               return false;
            } else {
               while (!a6(this.u9, var1)) {
                  var1 = this.c8(var1);
                  if (var1 == null) {
                     return false;
                  }
               }

               return true;
            }
         default:
            return false;
      }
   }

   @Override
   public boolean l6(com.aspose.slides.internal.x6s.a6 var1) {
      q0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, q0.class);
      if (var2 == null) {
         return false;
      }

      this.a0();
      var2.a0();
      return this.u9 == var2.u9 && this.c8 == var2.c8;
   }

   @Override
   public boolean k5(com.aspose.slides.internal.x6s.a6 var1) {
      q0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, q0.class);
      return var2 != null ? u3(this.u9, var2.u9) : false;
   }

   @Override
   public com.aspose.slides.internal.b8c.u4 k7() {
      return this.u9.getSchemaInfo();
   }

   private static l0 l6(l0 var0) {
      l0 var1 = var0.getParentNode();
      if (var1 != null) {
         return var1;
      }

      u8 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, u8.class);
      return var2 != null ? var2.u9() : null;
   }

   private static int k5(l0 var0) {
      int var1 = 0;

      for (l0 var2 = l6(var0); var2 != null; var2 = l6(var2)) {
         var1++;
      }

      return var1;
   }

   private int n5(l0 var1, l0 var2) {
      if (var1.getXPNodeType() == 2) {
         if (var2.getXPNodeType() != 2) {
            return 0;
         }

         m8 var7 = ((u8)var1).u9();
         if (var7.s7()) {
            w5 var4 = var7.getAttributes();

            for (int var5 = 0; var5 < var4.l6(); var5++) {
               u8 var6 = var4.n5(var5);
               if (var6 == var1) {
                  return 0;
               }

               if (var6 == var2) {
                  return 1;
               }
            }
         }

         return 3;
      } else {
         if (var2.getXPNodeType() == 2) {
            return 1;
         }

         l0 var3 = var1.getNextSibling();

         while (var3 != null && var3 != var2) {
            var3 = var3.getNextSibling();
         }

         return var3 == null ? 1 : 0;
      }
   }

   @Override
   public int u3(com.aspose.slides.internal.x6s.a6 var1) {
      q0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, q0.class);
      if (var2 == null) {
         return 3;
      }

      this.a0();
      var2.a0();
      if (this.u9 == var2.u9 && this.c8 == var2.c8) {
         return 2;
      }

      if (this.c8 == null && var2.c8 == null) {
         l0 var3 = this.u9;
         l0 var4 = var2.u9;
         l0 var5 = l6(var3);
         l0 var6 = l6(var4);
         if (var5 != var6) {
            int var7 = k5(var3);
            int var8 = k5(var4);
            if (var8 <= var7) {
               if (var7 > var8) {
                  while (var3 != null && var7 > var8) {
                     var3 = l6(var3);
                     var7--;
                  }

                  if (var3 == var4) {
                     return 1;
                  }

                  var5 = l6(var3);
               }
            } else {
               while (var4 != null && var8 > var7) {
                  var4 = l6(var4);
                  var8--;
               }

               if (var3 == var4) {
                  return 0;
               }

               var6 = l6(var4);
            }

            while (var5 != null && var6 != null) {
               if (var5 == var6) {
                  return this.n5(var3, var4);
               }

               var3 = var5;
               var4 = var6;
               var5 = l6(var3);
               var6 = l6(var4);
            }

            return 3;
         } else {
            return var5 == null ? 3 : this.n5(var3, var4);
         }
      } else {
         return super.u3(var1);
      }
   }

   @Override
   public final l0 m3() {
      return this.u9;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5(String var1, String var2, boolean var3) {
      String var4 = this.a6.getNameTable().l6(var2);
      if (var4 != null && this.u9.getNodeType() != 2) {
         String var5 = this.a6.getNameTable().l6(var1);
         if (var5 == null) {
            return new r4(this);
         } else if (var5.length() == 0) {
            return var3 ? new z8(this, var4) : new j5(this, var4);
         } else {
            return var3 ? new m3(this, var5, var4) : new k7(this, var5, var4);
         }
      } else {
         return new r4(this);
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5(int var1, boolean var2) {
      if (var1 == 1) {
         int var3 = this.u9.getNodeType();
         if (var3 != 9 && var3 != 1) {
            return new r4(this);
         } else {
            return var2 ? new m1(this) : new z3(this);
         }
      } else {
         return super.n5(var1, var2);
      }
   }

   public final void n5(l0 var1) {
      this.u9 = var1;
      u8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, u8.class);
      if (var2 != null) {
         m8 var3 = var2.u9();
         if (var3 != null) {
            int[] var4 = new int[]{this.h0};
            n5(var2, var3.getAttributes(), var4);
            this.h0 = var4[0];
            if (var2.h0()) {
               this.c8 = var3;
            }
         }
      }
   }

   private static boolean n5(u8 var0, w5 var1, int[] var2) {
      if (var1 != null) {
         for (int var3 = 0; var3 < var1.l6(); var3++) {
            if (var0 == var1.n5(var3)) {
               var2[0] = var3;
               return true;
            }
         }
      }

      var2[0] = 0;
      return false;
   }

   private static boolean n5(u8 var0, w5[] var1, int var2) {
      m8 var3 = var0.u9();
      if (var3 != null) {
         var1[0] = var3.getAttributes();
         if (var2 >= 0 && var2 < var1[0].l6() && var0 == var1[0].n5(var2)) {
            return true;
         }
      } else {
         var1[0] = null;
      }

      return false;
   }

   private void a0() {
      for (l0 var1 = this.t2(this.u9); var1 != null; var1 = this.t2(var1)) {
         this.n5(var1);
      }
   }

   private l0 u3(l0 var1) {
      l0 var2 = var1.getParentNode();
      return !this.a6.hasEntityReferences() ? var2 : this.a6(var2);
   }

   private l0 a6(l0 var1) {
      while (var1 != null && var1.getNodeType() == 5) {
         var1 = var1.getParentNode();
      }

      return var1;
   }

   private l0 u9(l0 var1) {
      l0 var2 = var1.getFirstChild();
      return !this.a6.hasEntityReferences() ? var2 : this.h0(var2);
   }

   private l0 h0(l0 var1) {
      while (var1 != null && var1.getNodeType() == 5) {
         var1 = var1.getFirstChild();
      }

      return var1;
   }

   private l0 c8(l0 var1) {
      l0 var2 = var1.getNextSibling();
      return !this.a6.hasEntityReferences() ? var2 : this.l6(var1, var2);
   }

   private l0 l6(l0 var1, l0 var2) {
      while (var2 == null) {
         var1 = var1.getParentNode();
         if (var1 == null || var1.getNodeType() != 5) {
            return null;
         }

         var2 = var1.getNextSibling();
      }

      while (var2 != null && var2.getNodeType() == 5) {
         var2 = var2.getFirstChild();
      }

      return var2;
   }

   private l0 t2(l0 var1) {
      l0 var2 = var1.getPreviousText();
      return !this.a6.hasEntityReferences() ? var2 : this.k5(var1, var2);
   }

   private l0 k5(l0 var1, l0 var2) {
      if (var2 != null) {
         return var2;
      }

      if (!var1.isText()) {
         return null;
      }

      l0 var3;
      for (var3 = var1.getPreviousSibling(); var3 == null; var3 = var1.getPreviousSibling()) {
         var1 = var1.getParentNode();
         if (var1 == null || var1.getNodeType() != 5) {
            return null;
         }
      }

      while (var3 != null) {
         switch (var3.getNodeType()) {
            case 3:
            case 4:
            case 13:
            case 14:
               return var3;
            case 5:
               var3 = var3.getLastChild();
               break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               return null;
         }
      }

      return null;
   }

   private static boolean u3(l0 var0, l0 var1) {
      while (true) {
         l0 var2 = var1.getParentNode();
         if (var2 == null) {
            u8 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, u8.class);
            if (var3 == null) {
               break;
            }

            var2 = var3.u9();
            if (var2 == null) {
               break;
            }
         }

         var1 = var2;
         if (var0 == var1) {
            return true;
         }
      }

      return false;
   }

   private static boolean a6(l0 var0, l0 var1) {
      switch (var0.getNodeType()) {
         case 1:
            return true;
         case 9:
            switch (var1.getNodeType()) {
               case 1:
               case 7:
               case 8:
                  return true;
               default:
                  return false;
            }
         case 11:
            switch (var1.getNodeType()) {
               case 1:
               case 3:
               case 4:
               case 7:
               case 8:
               case 13:
               case 14:
                  return true;
               case 2:
               case 5:
               case 6:
               case 9:
               case 10:
               case 11:
               case 12:
            }
      }

      return false;
   }

   private l0 s7(l0 var1) {
      l0 var2;
      do {
         var2 = var1;
         var1 = this.c8(var1);
      } while (var1 != null && var1.isText());

      return var2;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.a6 deepClone() {
      return this.n5();
   }

}
