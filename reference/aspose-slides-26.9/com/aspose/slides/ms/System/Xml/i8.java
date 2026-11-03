package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class i8 {
   private l0 k5;
   private l0 u3;
   private l0 a6;
   private int u9;
   private int h0;
   private z9 c8;
   private XmlDocument t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   private int e2;
   private boolean t9;
   private boolean z1;
   public i8$n5[] n5 = new i8$n5[]{new i8$n5(null, null), new i8$n5(null, null), new i8$n5(null, null)};
   public i8$n5[] l6 = new i8$n5[]{new i8$n5(null, null), new i8$n5(null, null)};
   private boolean t4;

   public i8(l0 var1) {
      this.k5 = var1;
      this.a6 = var1;
      int var2 = this.k5.getNodeType();
      if (var2 == 2) {
         this.u3 = null;
         this.u9 = -1;
         this.z1 = true;
      } else {
         this.u3 = var1;
         this.u9 = -1;
         this.z1 = false;
      }

      if (var2 == 9) {
         this.t2 = (XmlDocument)this.k5;
      } else {
         this.t2 = var1.getOwnerDocument();
      }

      this.c8 = this.t2.getNameTable();
      this.s7 = -1;
      this.x8 = -1;
      this.n3 = -1;
      this.t4 = false;
      this.t9 = false;
   }

   public final int n5() {
      int var1 = this.k5.getNodeType();
      if (this.s7 != -1) {
         return this.t4 ? 3 : 2;
      } else {
         return var1;
      }
   }

   public final String l6() {
      return this.k5.getNamespaceURI();
   }

   public final String k5() {
      if (this.s7 != -1) {
         if (this.t4) {
            return com.aspose.slides.ms.System.d1.n5;
         } else {
            return this.k5.getNodeType() == 17 ? this.n5[this.s7].n5 : this.l6[this.s7].n5;
         }
      } else {
         return this.h0(this.k5.getNodeType()) ? com.aspose.slides.ms.System.d1.n5 : this.k5.getName();
      }
   }

   public final String u3() {
      if (this.s7 != -1) {
         return this.k5();
      } else {
         return this.h0(this.k5.getNodeType()) ? com.aspose.slides.ms.System.d1.n5 : this.k5.getLocalName();
      }
   }

   public final boolean a6() {
      return this.z1;
   }

   private boolean h0(int var1) {
      switch (var1) {
         case 0:
         case 3:
         case 4:
         case 8:
         case 9:
         case 11:
         case 13:
         case 14:
         case 15:
         case 16:
            return true;
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 10:
         case 12:
         case 17:
            return false;
         default:
            return true;
      }
   }

   public final String u9() {
      return this.k5.getPrefix();
   }

   public final boolean h0() {
      return this.s7 != -1 ? true : this.k5.getValue() != null || this.k5.getNodeType() == 10;
   }

   public final String c8() {
      String var1 = null;
      int var2 = this.k5.getNodeType();
      if (this.s7 != -1) {
         return this.k5.getNodeType() == 17 ? this.n5[this.s7].l6 : this.l6[this.s7].l6;
      }

      if (var2 == 10) {
         var1 = ((j6)this.k5).a6();
      } else if (var2 == 17) {
         com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5(com.aspose.slides.ms.System.d1.n5);
         if (this.x8 == -1) {
            this.k7();
         }

         for (int var4 = 0; var4 < this.x8; var4++) {
            var3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{this.n5[var4].n5, "=\"", this.n5[var4].l6, "\""}));
            if (var4 != this.x8 - 1) {
               var3.n5(" ");
            }
         }

         var1 = var3.toString();
      } else {
         var1 = this.k5.getValue();
      }

      return var1 == null ? com.aspose.slides.ms.System.d1.n5 : var1;
   }

   public final String t2() {
      return this.k5.getBaseURI();
   }

   public final int s7() {
      return this.k5.getXmlSpace();
   }

   public final boolean x8() {
      return this.k5.getNodeType() == 1 ? ((m8)this.k5).t2() : false;
   }

   public final boolean n3() {
      return this.k5.getNodeType() == 2 ? !((u8)this.k5).a6() : false;
   }

   public final com.aspose.slides.internal.b8c.u4 y4() {
      return this.k5.getSchemaInfo();
   }

   public final z9 e2() {
      return this.c8;
   }

   public final int t9() {
      if (this.z1) {
         return 0;
      }

      int var1 = this.k5.getNodeType();
      if (var1 == 1) {
         return ((m8)this.k5).getAttributes().l6();
      }

      if (var1 != 2 && (!this.t4 || var1 == 17 || var1 == 10)) {
         if (var1 == 17) {
            if (this.x8 != -1) {
               return this.x8;
            }

            this.k7();
            return this.x8;
         } else {
            if (var1 != 10) {
               return 0;
            }

            if (this.n3 != -1) {
               return this.n3;
            }

            this.m3();
            return this.n3;
         }
      } else {
         return this.u3.getAttributes().l6();
      }
   }

   private void c8(int var1) {
      if (var1 < 0 || var1 >= this.t9()) {
         throw new ArgumentOutOfRangeException("attributeIndex");
      }
   }

   private void k7() {
      int var1 = 0;
      String var2 = this.t2.getVersion();
      if (var2 != null && var2.length() != 0) {
         this.n5[var1].n5 = "version";
         this.n5[var1].l6 = var2;
         var1++;
      }

      var2 = this.t2.getEncoding();
      if (var2 != null && var2.length() != 0) {
         this.n5[var1].n5 = "encoding";
         this.n5[var1].l6 = var2;
         var1++;
      }

      var2 = this.t2.getStandalone();
      if (var2 != null && var2.length() != 0) {
         this.n5[var1].n5 = "standalone";
         this.n5[var1].l6 = var2;
         var1++;
      }

      this.x8 = var1;
   }

   public final String n5(a1 var1, String var2) {
      if ("version".equals(var2)) {
         return var1.n5();
      } else if ("encoding".equals(var2)) {
         return var1.l6();
      } else {
         return "standalone".equals(var2) ? var1.k5() : null;
      }
   }

   public final String n5(int var1) {
      if (this.x8 == -1) {
         this.k7();
      }

      return this.n5[var1].l6;
   }

   public final int n5(String var1) {
      if (this.x8 == -1) {
         this.k7();
      }

      for (int var2 = 0; var2 < this.x8; var2++) {
         if (com.aspose.slides.ms.System.d1.a6(this.n5[var2].n5, var1)) {
            return var2;
         }
      }

      return -1;
   }

   private void m3() {
      int var1 = 0;
      j6 var2 = this.t2.getDocumentType();
      if (var2 == null) {
         this.n3 = 0;
      } else {
         String var3 = var2.k5();
         if (var3 != null) {
            this.l6[var1].n5 = "PUBLIC";
            this.l6[var1].l6 = var3;
            var1++;
         }

         var3 = var2.u3();
         if (var3 != null) {
            this.l6[var1].n5 = "SYSTEM";
            this.l6[var1].l6 = var3;
            var1++;
         }

         this.n3 = var1;
      }
   }

   public final String n5(j6 var1, String var2) {
      if ("PUBLIC".equals(var2)) {
         return var1.k5();
      } else {
         return "SYSTEM".equals(var2) ? var1.u3() : null;
      }
   }

   public final String l6(int var1) {
      if (this.n3 == -1) {
         this.m3();
      }

      return this.l6[var1].l6;
   }

   public final int l6(String var1) {
      if (this.n3 == -1) {
         this.m3();
      }

      for (int var2 = 0; var2 < this.n3; var2++) {
         if (com.aspose.slides.ms.System.d1.a6(this.l6[var2].n5, var1)) {
            return var2;
         }
      }

      return -1;
   }

   private String n5(m8 var1, String var2) {
      u8 var3 = var1.l6(var2);
      return var3 != null ? var3.getValue() : null;
   }

   public final String k5(String var1) {
      if (this.z1) {
         return null;
      }

      switch (this.k5.getNodeType()) {
         case 1:
            return this.n5((m8)this.k5, var1);
         case 2:
            return this.n5((m8)this.u3, var1);
         case 10:
            return this.n5((j6)this.k5, var1);
         case 17:
            return this.n5((a1)this.k5, var1);
         default:
            return null;
      }
   }

   public final String k5(int var1) {
      if (this.z1) {
         return null;
      }

      switch (this.k5.getNodeType()) {
         case 1:
            this.c8(var1);
            return ((m8)this.k5).getAttributes().n5(var1).getValue();
         case 2:
            this.c8(var1);
            return ((m8)this.u3).getAttributes().n5(var1).getValue();
         case 10:
            this.c8(var1);
            return this.l6(var1);
         case 17:
            this.c8(var1);
            return this.n5(var1);
         default:
            throw new ArgumentOutOfRangeException("attributeIndex");
      }
   }

   public final void u3(int var1) {
      this.a6 = this.k5;
      this.y4 = var1;
      this.e2 = this.s7;
      this.h0 = this.u9;
      this.t9 = this.t4;
   }

   public final void n5(int[] var1) {
      this.k5 = this.a6;
      var1[0] = this.y4;
      this.s7 = this.e2;
      this.u9 = this.h0;
      this.t4 = this.t9;
   }

   private boolean z8() {
      int var1 = this.k5.getNodeType();
      return var1 == 17 || var1 == 10;
   }

   public final void l6(int[] var1) {
      if (!this.z1) {
         if (this.t4) {
            if (this.z8()) {
               var1[0] -= 2;
            } else {
               while (this.k5.getNodeType() != 2 && (this.k5 = this.k5.getParentNode()) != null) {
                  var1[0]--;
               }
            }

            this.t4 = false;
         }
      }
   }

   public final void n5(int[] var1, int[] var2) {
      this.u3(var1[0]);
      if (!this.z1) {
         if (this.s7 != -1) {
            if (this.t4) {
               var1[0]--;
               this.t4 = false;
            }

            this.e2 = this.s7;
            var1[0]--;
            this.s7 = -1;
            var2[0] = this.k5.getNodeType();
         } else {
            if (this.t4 && this.k5.getNodeType() != 2) {
               this.l6(var1);
            }

            if (this.k5.getNodeType() == 2) {
               this.k5 = ((u8)this.k5).u9();
               this.u9 = -1;
               var1[0]--;
               var2[0] = 1;
            }

            if (this.k5.getNodeType() == 1) {
               this.u3 = this.k5;
            }
         }
      }
   }

   public final boolean u3(String var1) {
      return this.n5(var1, com.aspose.slides.ms.System.d1.n5);
   }

   private boolean n5(m8 var1, String var2, String var3) {
      u8 var4 = null;
      if (var3.length() == 0) {
         var4 = var1.l6(var2);
      } else {
         var4 = var1.a6(var2, var3);
      }

      if (var4 != null) {
         this.t4 = false;
         this.u3 = var1;
         this.k5 = var4;
         this.u9 = var1.getAttributes().n5(var4);
         if (this.u9 != -1) {
            return true;
         }
      }

      return false;
   }

   public final boolean n5(String var1, String var2) {
      if (this.z1) {
         return false;
      }

      int var3 = this.k5.getNodeType();
      if (var3 == 1) {
         return this.n5((m8)this.k5, var1, var2);
      }

      if (var3 == 2) {
         return this.n5((m8)this.u3, var1, var2);
      }

      if (var3 == 17 && var2.length() == 0) {
         if ((this.s7 = this.n5(var1)) != -1) {
            this.t4 = false;
            return true;
         }
      } else if (var3 == 10 && var2.length() == 0 && (this.s7 = this.l6(var1)) != -1) {
         this.t4 = false;
         return true;
      }

      return false;
   }

   public final void a6(int var1) {
      if (!this.z1) {
         Object var2 = null;
         switch (this.k5.getNodeType()) {
            case 1:
               this.c8(var1);
               var2 = ((m8)this.k5).getAttributes().n5(var1);
               if (var2 != null) {
                  this.u3 = this.k5;
                  this.k5 = (l0)var2;
                  this.u9 = var1;
               }
               break;
            case 2:
               this.c8(var1);
               var2 = ((m8)this.u3).getAttributes().n5(var1);
               if (var2 != null) {
                  this.k5 = (l0)var2;
                  this.u9 = var1;
               }
               break;
            case 10:
            case 17:
               this.c8(var1);
               this.s7 = var1;
         }
      }
   }

   public final boolean k5(int[] var1) {
      if (this.z1) {
         return false;
      }

      int var2 = this.k5.getNodeType();
      if (var2 == 2) {
         if (this.u9 >= this.u3.getAttributes().l6() - 1) {
            return false;
         }

         this.k5 = this.u3.getAttributes().n5(++this.u9);
         return true;
      } else {
         if (var2 == 1) {
            if (this.k5.getAttributes().l6() > 0) {
               var1[0]++;
               this.u3 = this.k5;
               this.k5 = this.k5.getAttributes().n5(0);
               this.u9 = 0;
               return true;
            }
         } else if (var2 == 17) {
            if (this.x8 == -1) {
               this.k7();
            }

            this.s7++;
            if (this.s7 < this.x8) {
               if (this.s7 == 0) {
                  var1[0]++;
               }

               this.t4 = false;
               return true;
            }

            this.s7--;
         } else if (var2 == 10) {
            if (this.n3 == -1) {
               this.m3();
            }

            this.s7++;
            if (this.s7 < this.n3) {
               if (this.s7 == 0) {
                  var1[0]++;
               }

               this.t4 = false;
               return true;
            }

            this.s7--;
         }

         return false;
      }
   }

   public final boolean z1() {
      l0 var1 = this.k5.getParentNode();
      if (var1 != null) {
         this.k5 = var1;
         if (!this.t4) {
            this.u9 = 0;
         }

         return true;
      } else {
         return false;
      }
   }

   public final boolean t4() {
      l0 var1 = this.k5.getFirstChild();
      if (var1 != null) {
         this.k5 = var1;
         if (!this.t4) {
            this.u9 = -1;
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean n5(l0 var1) {
      l0 var2 = var1.getNextSibling();
      if (var2 != null) {
         this.k5 = var2;
         if (!this.t4) {
            this.u9 = -1;
         }

         return true;
      } else {
         return false;
      }
   }

   public final boolean q0() {
      return this.k5.getNodeType() != 2 ? this.n5(this.k5) : this.n5(this.u3);
   }

   public final boolean z3() {
      if (this.z1) {
         return false;
      }

      switch (this.k5.getNodeType()) {
         case 2:
            if (this.u3 != null) {
               this.k5 = this.u3;
               this.u9 = -1;
               return true;
            }
            break;
         case 10:
         case 17:
            if (this.s7 != -1) {
               this.s7 = -1;
               return true;
            }
      }

      return false;
   }

   public final String a6(String var1) {
      if (this.z1) {
         return null;
      }

      if ("xmlns".equals(var1)) {
         return this.c8.n5("http://www.w3.org/2000/xmlns/");
      }

      if ("xml".equals(var1)) {
         return this.c8.n5("http://www.w3.org/XML/1998/namespace");
      }

      if (var1 == null) {
         var1 = com.aspose.slides.ms.System.d1.n5;
      }

      String var2;
      if (var1.length() == 0) {
         var2 = "xmlns";
      } else {
         var2 = com.aspose.slides.ms.System.d1.n5(new String[]{"xmlns:", var1});
      }

      l0 var3 = this.k5;

      while (var3 != null) {
         if (var3.getNodeType() == 1) {
            m8 var4 = (m8)var3;
            if (var4.s7()) {
               u8 var5 = var4.l6(var2);
               if (var5 != null) {
                  return var5.getValue();
               }
            }
         } else if (var3.getNodeType() == 2) {
            var3 = ((u8)var3).u9();
            continue;
         }

         var3 = var3.getParentNode();
      }

      return var1.length() == 0 ? com.aspose.slides.ms.System.d1.n5 : null;
   }

   public final String u9(String var1) {
      if (!this.z1 && var1 != null) {
         if ("http://www.w3.org/2000/xmlns/".equals(var1)) {
            return this.c8.n5("xmlns");
         }

         if ("http://www.w3.org/XML/1998/namespace".equals(var1)) {
            return this.c8.n5("xml");
         }

         if (com.aspose.slides.ms.System.d1.a6(var1, com.aspose.slides.ms.System.d1.n5)) {
            return com.aspose.slides.ms.System.d1.n5;
         }

         l0 var2 = this.k5;

         while (var2 != null) {
            if (var2.getNodeType() == 1) {
               m8 var3 = (m8)var2;
               if (var3.s7()) {
                  w5 var4 = var3.getAttributes();

                  for (int var5 = 0; var5 < var4.l6(); var5++) {
                     u8 var6 = var4.n5(var5);
                     if (com.aspose.slides.ms.System.d1.a6(var6.getValue(), var1)) {
                        if (var6.getPrefix().length() == 0 && "xmlns".equals(var6.getLocalName())) {
                           if (com.aspose.slides.ms.System.d1.a6(this.a6(com.aspose.slides.ms.System.d1.n5), var1)) {
                              return com.aspose.slides.ms.System.d1.n5;
                           }
                        } else if ("xmlns".equals(var6.getPrefix())) {
                           String var7 = var6.getLocalName();
                           if (com.aspose.slides.ms.System.d1.a6(this.a6(var7), var1)) {
                              return this.c8.n5(var7);
                           }
                        }
                     }
                  }
               }
            } else if (var2.getNodeType() == 2) {
               var2 = ((u8)var2).u9();
               continue;
            }

            var2 = var2.getParentNode();
         }

         return null;
      } else {
         return null;
      }
   }

   public final IGenericDictionary<String, String> u9(int var1) {
      Dictionary var2 = new Dictionary();
      if (this.z1) {
         return var2;
      }

      l0 var3 = this.k5;

      while (var3 != null) {
         if (var3.getNodeType() == 1) {
            m8 var4 = (m8)var3;
            if (var4.s7()) {
               w5 var5 = var4.getAttributes();

               for (int var6 = 0; var6 < var5.l6(); var6++) {
                  u8 var7 = var5.n5(var6);
                  if ("xmlns".equals(var7.getLocalName()) && var7.getPrefix().length() == 0) {
                     if (!var2.containsKey(com.aspose.slides.ms.System.d1.n5)) {
                        var2.addItem(this.c8.n5(com.aspose.slides.ms.System.d1.n5), this.c8.n5(var7.getValue()));
                     }
                  } else if ("xmlns".equals(var7.getPrefix())) {
                     String var8 = var7.getLocalName();
                     if (!var2.containsKey(var8)) {
                        var2.addItem(this.c8.n5(var8), this.c8.n5(var7.getValue()));
                     }
                  }
               }
            }

            if (var1 == 2) {
               break;
            }
         } else if (var3.getNodeType() == 2) {
            var3 = ((u8)var3).u9();
            continue;
         }

         var3 = var3.getParentNode();
      }

      if (var1 != 2) {
         if (var2.containsKey(com.aspose.slides.ms.System.d1.n5)
            && com.aspose.slides.ms.System.d1.a6((String)var2.get_Item(com.aspose.slides.ms.System.d1.n5), com.aspose.slides.ms.System.d1.n5)) {
            var2.removeItemByKey(com.aspose.slides.ms.System.d1.n5);
         }

         if (var1 == 0) {
            var2.addItem(this.c8.n5("xml"), this.c8.n5("http://www.w3.org/XML/1998/namespace"));
         }
      }

      return var2;
   }

   public final boolean n5(int[] var1, boolean[] var2, int[] var3) {
      if (this.s7 != -1) {
         if (!this.t4) {
            this.t4 = true;
            var1[0]++;
            var3[0] = 3;
            return true;
         } else {
            return false;
         }
      } else {
         if (this.k5.getNodeType() == 2) {
            l0 var4 = this.k5.getFirstChild();
            if (var4 != null) {
               this.k5 = var4;
               var3[0] = this.k5.getNodeType();
               var1[0]++;
               this.t4 = true;
               return true;
            }
         } else if (this.t4) {
            Object var6 = null;
            if (this.k5.getNodeType() == 5 && var2[0]) {
               this.k5 = this.k5.getFirstChild();
               var3[0] = this.k5.getNodeType();
               var1[0]++;
               var2[0] = false;
               return true;
            }

            var6 = this.k5.getNextSibling();
            if (var6 == null) {
               l0 var5 = this.k5.getParentNode();
               if (var5 != null && var5.getNodeType() == 5) {
                  this.k5 = var5;
                  var3[0] = 16;
                  var1[0]--;
                  return true;
               }
            }

            if (var6 != null) {
               this.k5 = (l0)var6;
               var3[0] = this.k5.getNodeType();
               return true;
            }

            return false;
         }

         return false;
      }
   }

   public final XmlDocument m1() {
      return this.t2;
   }
}
