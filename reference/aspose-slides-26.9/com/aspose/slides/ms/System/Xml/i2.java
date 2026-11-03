package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.ms.System.IDisposable;

public class i2 {
   private XmlDocument n5;
   private c7 l6;
   private boolean k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "version", "encoding", "standalone", "PUBLIC", "SYSTEM", "lt", "gt", "amp", "apos", "quot"
   );

   public final void n5(XmlDocument var1, c7 var2, boolean var3) {
      this.n5 = var1;
      if (com.aspose.slides.ms.System.j8.n5(var2) == com.aspose.slides.internal.v6g.k5.n5(p5.class)) {
         this.l6 = ((p5)var2).u6();
      } else {
         this.l6 = var2;
      }

      this.k5 = var3;
      if (var1 == null) {
         throw new ArgumentException(v3.n5("The document to be loaded could not be found."));
      }

      if (var2 == null) {
         throw new ArgumentException(v3.n5("There is no reader from which to load the document."));
      }

      var1.setBaseURI(var2.q0());
      if (var2.n5() != null && var2.n5().z1() == 4) {
         var1.setSchemas(var2.n5().q0());
      }

      if (this.l6.h0() == 1 || this.l6.u9()) {
         this.n5(var1);
      }
   }

   private void n5(XmlDocument var1) {
      l0 var2 = null;

      while ((var2 = this.n5(true)) != null) {
         var1.appendChildForLoad(var2, var1);
         if (!this.l6.u9()) {
            return;
         }
      }
   }

   public final l0 n5(XmlDocument var1, c7 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = true;
      if (var1 == null) {
         throw new ArgumentException(v3.n5("The document to be loaded could not be found."));
      }

      if (var2 == null) {
         throw new ArgumentException(v3.n5("There is no reader from which to load the document."));
      }

      if (var2.h0() == 0) {
         var2.u9();
      }

      if (var2.h0() == 1) {
         l0 var3 = this.n5(true);
         if (var3.getNodeType() != 2) {
            var2.u9();
         }

         return var3;
      } else {
         return null;
      }
   }

   private l0 n5(boolean var1) {
      c7 var2 = this.l6;
      l0 var3 = null;

      do {
         l0 var4 = null;
         switch (var2.s7()) {
            case 1:
               boolean var5 = var2.m1();
               m8 var11 = this.n5.createElement(var2.e2(), var2.n3(), var2.y4());
               var11.l6(var5);
               if (var2.k5()) {
                  w5 var7 = var11.getAttributes();

                  do {
                     u8 var8 = this.n5();
                     var7.l6(var8);
                  } while (var2.u3());

                  var2.a6();
               }

               if (!var5) {
                  if (var3 != null) {
                     var3.appendChildForLoad(var11, this.n5);
                  }

                  var3 = var11;
                  continue;
               }

               com.aspose.slides.internal.b8c.u4 var12 = var2.m3();
               if (var12 != null) {
                  var11.n5(this.n5.addXmlName(var11.getPrefix(), var11.getLocalName(), var11.getNamespaceURI(), var12));
               }

               var4 = var11;
               break;
            case 2:
               var4 = this.n5();
               break;
            case 3:
               var4 = this.n5.createTextNode(var2.z1());
               break;
            case 4:
               var4 = this.n5.createCDataSection(var2.z1());
               break;
            case 5:
               var4 = this.l6(false);
               break;
            case 6:
            case 9:
            case 11:
            case 12:
            default:
               throw n5(var2.s7());
            case 7:
               var4 = this.n5.createProcessingInstruction(var2.x8(), var2.z1());
               break;
            case 8:
               var4 = this.n5.createComment(var2.z1());
               break;
            case 10:
               var4 = this.u3();
               break;
            case 13:
               if (!this.k5) {
                  if (var3 == null && !var1) {
                     return null;
                  }
                  continue;
               }

               var4 = this.n5.createWhitespace(var2.z1());
               break;
            case 14:
               var4 = this.n5.createSignificantWhitespace(var2.z1());
               break;
            case 15:
               if (var3 == null) {
                  return null;
               }

               com.aspose.slides.internal.b8c.u4 var9 = var2.m3();
               if (var9 != null) {
                  m8 var6 = com.aspose.slides.internal.v6g.k5.n5(var3, m8.class);
                  if (var6 != null) {
                     var6.n5(this.n5.addXmlName(var6.getPrefix(), var6.getLocalName(), var6.getNamespaceURI(), var9));
                  }
               }

               if (var3.getParentNode() == null) {
                  return var3;
               }

               var3 = var3.getParentNode();
               continue;
            case 16:
               return null;
            case 17:
               var4 = this.k5();
         }

         if (var3 == null) {
            return var4;
         }

         var3.appendChildForLoad(var4, this.n5);
      } while (var2.u9());

      if (var3 != null) {
         while (var3.getParentNode() != null) {
            var3 = var3.getParentNode();
         }
      }

      return var3;
   }

   private u8 n5() {
      c7 var1 = this.l6;
      if (var1.l6()) {
         return this.l6();
      }

      u8 var2 = this.n5.createAttribute(var1.e2(), var1.n3(), var1.y4());
      com.aspose.slides.internal.b8c.u4 var3 = var1.m3();
      if (var3 != null) {
         var2.n5(this.n5.addAttrXmlName(var2.getPrefix(), var2.getLocalName(), var2.getNamespaceURI(), var3));
      }

      while (var1.c8()) {
         e0 var4;
         switch (var1.s7()) {
            case 3:
               var4 = this.n5.createTextNode(var1.z1());
               break;
            case 5:
               var4 = this.n5.createEntityReference(var1.n3());
               if (var1.z3()) {
                  var1.a0();
                  this.n5(var4, false);
                  if (var4.getFirstChild() == null) {
                     var4.appendChildForLoad(this.n5.createTextNode(com.aspose.slides.ms.System.d1.n5), this.n5);
                  }
               }
               break;
            default:
               throw n5(var1.s7());
         }

         var2.appendChildForLoad(var4, this.n5);
      }

      return var2;
   }

   private u8 l6() {
      c7 var1 = this.l6;
      u8 var2 = this.n5.createDefaultAttribute(var1.e2(), var1.n3(), var1.y4());
      com.aspose.slides.internal.b8c.u4 var3 = var1.m3();
      if (var3 != null) {
         var2.n5(this.n5.addAttrXmlName(var2.getPrefix(), var2.getLocalName(), var2.getNamespaceURI(), var3));
      }

      this.n5(var2, false);
      o4 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, o4.class);
      if (var4 != null) {
         var4.n5(false);
      }

      return var2;
   }

   private void n5(l0 var1, boolean var2) {
      c7 var3 = this.l6;

      while (var3.c8()) {
         e0 var4;
         switch (var3.s7()) {
            case 3:
               var4 = var2 ? new t0(var3.z1(), this.n5) : this.n5.createTextNode(var3.z1());
               break;
            case 5:
               var4 = var2 ? new t6(this.l6.n3(), this.n5) : this.n5.createEntityReference(this.l6.n3());
               if (var3.z3()) {
                  var3.a0();
                  this.n5(var4, var2);
                  if (var4.getFirstChild() == null) {
                     var4.appendChildForLoad(
                        var2 ? new t0(com.aspose.slides.ms.System.d1.n5) : this.n5.createTextNode(com.aspose.slides.ms.System.d1.n5), this.n5
                     );
                  }
               }
               break;
            case 16:
               return;
            default:
               throw n5(var3.s7());
         }

         var1.appendChildForLoad(var4, this.n5);
      }
   }

   private t6 l6(boolean var1) {
      t6 var2 = var1 ? new t6(this.l6.x8(), this.n5) : this.n5.createEntityReference(this.l6.x8());
      if (this.l6.z3()) {
         this.l6.a0();

         while (this.l6.u9() && this.l6.s7() != 16) {
            l0 var3 = var1 ? this.a6() : this.n5(false);
            if (var3 != null) {
               var2.appendChildForLoad(var3, this.n5);
            }
         }

         if (var2.getLastChild() == null) {
            var2.appendChildForLoad(this.n5.createTextNode(com.aspose.slides.ms.System.d1.n5), this.n5);
         }
      }

      return var2;
   }

   private a1 k5() {
      String var1 = null;
      String var2 = null;
      String var3 = null;

      while (this.l6.u3()) {
         switch (u3.n5(this.l6.x8())) {
            case 0:
               var1 = this.l6.z1();
               break;
            case 1:
               var2 = this.l6.z1();
               break;
            case 2:
               var3 = this.l6.z1();
         }
      }

      if (var1 == null) {
         String[] var4 = new String[]{var1};
         String[] var5 = new String[]{var2};
         String[] var6 = new String[]{var3};
         n5(this.l6.z1(), var4, var5, var6);
         var1 = var4[0];
         var2 = var5[0];
         var3 = var6[0];
      }

      return this.n5.createXmlDeclaration(var1, var2, var3);
   }

   private j6 u3() {
      String var1 = null;
      String var2 = null;
      String var3 = this.l6.z1();
      String var4 = this.l6.n3();

      while (this.l6.u3()) {
         switch (u3.n5(this.l6.x8())) {
            case 3:
               var1 = this.l6.z1();
               break;
            case 4:
               var2 = this.l6.z1();
         }
      }

      j6 var5 = this.n5.createDocumentType(var4, var1, var2, var3);
      z7 var6 = this.l6.d2();
      if (var6 != null) {
         this.n5(var6, var5);
      } else {
         this.n5(var5);
      }

      return var5;
   }

   private l0 a6() {
      c7 var1 = this.l6;
      l0 var2 = null;

      do {
         l0 var3 = null;
         switch (var1.s7()) {
            case 1:
               boolean var4 = this.l6.m1();
               m8 var5 = new m8(this.l6.e2(), this.l6.n3(), this.l6.y4(), this.n5);
               var5.l6(var4);
               if (this.l6.k5()) {
                  w5 var6 = var5.getAttributes();

                  do {
                     u8 var7 = this.u9();
                     var6.l6(var7);
                  } while (var1.u3());
               }

               if (!var4) {
                  var2.appendChildForLoad(var5, this.n5);
                  var2 = var5;
                  continue;
               }

               var3 = var5;
               break;
            case 2:
               var3 = this.u9();
               break;
            case 3:
               var3 = new t0(this.l6.z1(), this.n5);
               break;
            case 4:
               var3 = new u5(this.l6.z1(), this.n5);
               break;
            case 5:
               var3 = this.l6(true);
               break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               throw n5(this.l6.s7());
            case 7:
               var3 = new j1(this.l6.x8(), this.l6.z1(), this.n5);
               break;
            case 8:
               var3 = new h5(this.l6.z1(), this.n5);
               break;
            case 13:
               if (!this.k5) {
                  continue;
               }

               var3 = new d3(this.l6.z1(), this.n5);
               break;
            case 14:
               var3 = new n8(this.l6.z1(), this.n5);
               break;
            case 15:
               if (var2.getParentNode() == null) {
                  return var2;
               }

               var2 = var2.getParentNode();
            case 16:
               continue;
         }

         if (var2 == null) {
            return var3;
         }

         var2.appendChildForLoad(var3, this.n5);
      } while (var1.u9());

      return null;
   }

   private u8 u9() {
      c7 var1 = this.l6;
      if (var1.l6()) {
         o4 var2 = new o4(var1.e2(), var1.n3(), var1.y4(), this.n5);
         this.n5(var2, true);
         var2.n5(false);
         return var2;
      } else {
         u8 var3 = new u8(var1.e2(), var1.n3(), var1.y4(), this.n5);
         this.n5(var3, true);
         return var3;
      }
   }

   public final void n5(j6 var1) {
      XmlDocument var2 = var1.getOwnerDocument();
      if (var2.hasSetResolver()) {
         this.n5(var1, true, var2.getResolver());
      } else {
         this.n5(var1, false, null);
      }
   }

   private void n5(j6 var1, boolean var2, o8 var3) {
      this.n5 = var1.getOwnerDocument();
      b1 var4 = new b1(null, new s2(this.n5.getNameTable()), null, null, null, null, this.n5.getBaseURI(), com.aspose.slides.ms.System.d1.n5, 0);
      b0 var5 = new b0("", 1, var4);
      var5.l6(var1.u9());
      if (var2) {
         var5.n5(var3);
      }

      v4 var6 = y2.n5();
      b0$l6 var7 = new b0$l6(var5);
      z7 var8 = var6.n5(this.n5.getBaseURI(), var1.getName(), var1.k5(), var1.u3(), var1.a6(), var7);
      this.n5(var8, var1);
   }

   private void n5(z7 var1, j6 var2) {
      com.aspose.slides.internal.b8c.x0 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.b8c.x0.class);
      if (var3 == null) {
         throw new XmlException("An internal error has occurred.", com.aspose.slides.ms.System.d1.n5);
      }

      var2.n5(var3);
      if (var3 != null) {
         this.n5.setDtdSchemaInfo(var3);
         if (var3.t9() != null) {
            Dictionary$ValueCollection$Enumerator var4 = var3.t9().getValues().iterator();

            try {
               while (var4.hasNext()) {
                  com.aspose.slides.internal.b8c.i2 var5 = (com.aspose.slides.internal.b8c.i2)var4.next();
                  var2.l6().n5(new b2(var5.n5().l6(), var5.k5(), var5.l6(), this.n5));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }

         if (var3.t2() != null) {
            Dictionary$ValueCollection$Enumerator var21 = var3.t2().getValues().iterator();

            try {
               while (var21.hasNext()) {
                  com.aspose.slides.internal.b8c.v6 var24 = (com.aspose.slides.internal.b8c.v6)var21.next();
                  h1 var6 = new h1(var24.y4().l6(), var24.z3(), var24.t9(), var24.e2(), var24.q0().k5() ? null : var24.q0().l6(), this.n5);
                  var6.n5(var24.j5());
                  var2.n5().n5(var6);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
                  var21.dispose();
               }
            }
         }

         if (var3.s7() != null) {
            Dictionary$ValueCollection$Enumerator var22 = var3.s7().getValues().iterator();

            try {
               while (var22.hasNext()) {
                  com.aspose.slides.internal.b8c.v6 var25 = (com.aspose.slides.internal.b8c.v6)var22.next();
                  h1 var27 = new h1(var25.y4().l6(), var25.z3(), var25.t9(), var25.e2(), var25.q0().k5() ? null : var25.q0().l6(), this.n5);
                  var27.n5(var25.j5());
                  var2.n5().n5(var27);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
                  var22.dispose();
               }
            }
         }

         this.n5.setEntities(var2.n5());
         Dictionary$Enumerator var23 = var3.h0().iterator();
         if (var23 != null) {
            var23.reset();

            while (var23.hasNext()) {
               com.aspose.slides.internal.b8c.t6 var26 = (com.aspose.slides.internal.b8c.t6)var23.getValue();
               if (var26.k7() != null) {
                  Dictionary$Enumerator var28 = var26.k7().iterator();

                  while (var28.hasNext()) {
                     com.aspose.slides.internal.b8c.h9 var7 = (com.aspose.slides.internal.b8c.h9)var28.getValue();
                     if (var7.a0().t2() == 1) {
                        this.n5
                           .addIdInfo(
                              this.n5.addXmlName(var26.j5(), var26.z8().l6(), com.aspose.slides.ms.System.d1.n5, null),
                              this.n5.addAttrXmlName(var7.j5(), var7.z8().l6(), com.aspose.slides.ms.System.d1.n5, null)
                           );
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   private b1 n5(l0 var1) {
      String var2 = null;
      byte var3 = 0;
      j6 var4 = this.n5.getDocumentType();
      String var5 = this.n5.getBaseURI();
      Hashtable var6 = new Hashtable();
      z9 var7 = this.n5.getNameTable();
      s2 var8 = new s2(var7);
      boolean var9 = false;

      while (var1 != null && var1 != this.n5) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, m8.class) && ((m8)var1).s7()) {
            var8.k5();
            IEnumerator var10 = ((m8)var1).getAttributes().iterator();

            try {
               while (var10.hasNext()) {
                  u8 var11 = (u8)var10.next();
                  if (com.aspose.slides.ms.System.d1.a6(var11.getPrefix(), this.n5.strXmlns) && !var6.contains(var11.getLocalName())) {
                     var6.addItem(var11.getLocalName(), var11.getLocalName());
                     var8.n5(var11.getLocalName(), var11.getValue());
                  } else if (!var9 && var11.getPrefix().length() == 0 && com.aspose.slides.ms.System.d1.a6(var11.getLocalName(), this.n5.strXmlns)) {
                     var8.n5(com.aspose.slides.ms.System.d1.n5, var11.getValue());
                     var9 = true;
                  } else if (var3 == 0
                     && com.aspose.slides.ms.System.d1.a6(var11.getPrefix(), this.n5.strXml)
                     && com.aspose.slides.ms.System.d1.a6(var11.getLocalName(), this.n5.strSpace)) {
                     if ("default".equals(var11.getValue())) {
                        var3 = 1;
                     } else if ("preserve".equals(var11.getValue())) {
                        var3 = 2;
                     }
                  } else if (var2 == null
                     && com.aspose.slides.ms.System.d1.a6(var11.getPrefix(), this.n5.strXml)
                     && com.aspose.slides.ms.System.d1.a6(var11.getLocalName(), this.n5.strLang)) {
                     var2 = var11.getValue();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  ((IDisposable)var10).dispose();
               }
            }
         }

         var1 = var1.getParentNode();
      }

      return new b1(
         var7,
         var8,
         var4 == null ? null : var4.getName(),
         var4 == null ? null : var4.k5(),
         var4 == null ? null : var4.u3(),
         var4 == null ? null : var4.a6(),
         var5,
         var2,
         var3
      );
   }

   public final s2 n5(l0 var1, String var2, int var3) {
      this.n5 = var1.getOwnerDocument();
      b1 var4 = this.n5(var1);
      this.l6 = this.n5(var2, var3, var4, this.n5);

      try {
         this.k5 = true;
         boolean var5 = this.n5.isLoading();
         this.n5.setLoading(true);
         if (var3 == 6) {
            l0 var11 = null;

            while (this.l6.u9() && (var11 = this.a6()) != null) {
               var1.appendChildForLoad(var11, this.n5);
            }
         } else {
            l0 var6 = null;

            while (this.l6.u9() && (var6 = this.n5(true)) != null) {
               var1.appendChildForLoad(var6, this.n5);
            }
         }

         this.n5.setLoading(var5);
      } finally {
         this.l6.w1();
      }

      return var4.l6();
   }

   public final void n5(m8 var1, String var2) {
      s2 var3 = this.n5(var1, var2, 1);
      if (var1.getChildNodes().n5() > 0) {
         this.n5(var1, var3, false);
      }
   }

   public final void n5(u8 var1, String var2) {
      this.n5(var1, var2, 2);
   }

   private void n5(m8 var1, s2 var2, boolean var3) {
      var2.k5();
      w5 var4 = var1.getAttributes();
      int var5 = var4.l6();
      if (var3 && var5 > 0) {
         for (int var6 = var5 - 1; var6 >= 0; var6--) {
            u8 var7 = var4.n5(var6);
            if (com.aspose.slides.ms.System.d1.a6(var7.getPrefix(), this.n5.strXmlns)) {
               String var8 = var2.n5(var7.getLocalName());
               if (var8 != null) {
                  if (com.aspose.slides.ms.System.d1.a6(var7.getValue(), var8)) {
                     var1.getAttributes().k5(var6);
                  }
               } else {
                  var2.n5(var7.getLocalName(), var7.getValue());
               }
            } else if (var7.getPrefix().length() == 0 && com.aspose.slides.ms.System.d1.a6(var7.getLocalName(), this.n5.strXmlns)) {
               String var11 = var2.l6();
               if (var11 != null) {
                  if (com.aspose.slides.ms.System.d1.a6(var7.getValue(), var11)) {
                     var1.getAttributes().k5(var6);
                  }
               } else {
                  var2.n5(var7.getLocalName(), var7.getValue());
               }
            }
         }
      }

      for (l0 var9 = var1.getFirstChild(); var9 != null; var9 = var9.getNextSibling()) {
         m8 var10 = com.aspose.slides.internal.v6g.k5.n5(var9, m8.class);
         if (var10 != null) {
            this.n5(var10, var2, true);
         }
      }

      var2.u3();
   }

   private String n5(String var1) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{"&", var1, ";"});
   }

   public final void n5(h1 var1) {
      this.n5(var1, this.n5(var1.getName()), 6);
   }

   public final void n5(t6 var1) {
      this.n5 = var1.getOwnerDocument();
      boolean var2 = this.n5.isLoading();
      this.n5.setLoading(true);
      switch (u3.n5(var1.getName())) {
         case 5:
            var1.appendChildForLoad(this.n5.createTextNode("<"), this.n5);
            this.n5.setLoading(var2);
            return;
         case 6:
            var1.appendChildForLoad(this.n5.createTextNode(">"), this.n5);
            this.n5.setLoading(var2);
            return;
         case 7:
            var1.appendChildForLoad(this.n5.createTextNode("&"), this.n5);
            this.n5.setLoading(var2);
            return;
         case 8:
            var1.appendChildForLoad(this.n5.createTextNode("'"), this.n5);
            this.n5.setLoading(var2);
            return;
         case 9:
            var1.appendChildForLoad(this.n5.createTextNode("\""), this.n5);
            this.n5.setLoading(var2);
            return;
         default:
            f8 var3 = this.n5.getEntities();
            IEnumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  h1 var5 = (h1)var4.next();
                  if (v8.n5(var5.getName(), var1.getName())) {
                     this.n5(var1, this.n5(var1.getName()), 5);
                     return;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  ((IDisposable)var4).dispose();
               }
            }

            if (!this.n5.getActualLoadingStatus()) {
               var1.appendChildForLoad(this.n5.createTextNode(""), this.n5);
               this.n5.setLoading(var2);
            } else {
               this.n5.setLoading(var2);
               throw new XmlException("Reference to undeclared parameter entity '{0}'.", var1.getName());
            }
      }
   }

   private c7 n5(String var1, int var2, b1 var3, XmlDocument var4) {
      int var5 = var2;
      if (var5 == 6 || var5 == 5) {
         var5 = 1;
      }

      b0 var6 = new b0(var1, var5, var3);
      var6.a6(true);
      if (var4.hasSetResolver()) {
         var6.n5(var4.getResolver());
      }

      if (!var4.getActualLoadingStatus()) {
         var6.u9(true);
      }

      j6 var7 = var4.getDocumentType();
      if (var7 != null) {
         var6.l6(var7.u9());
         if (var7.h0() != null) {
            var6.n5(var7.h0());
         } else {
            v4 var8 = y2.n5();
            b0$l6 var9 = new b0$l6(var6);
            z7 var10 = var8.n5(var3.u9(), var3.k5(), var3.u3(), var3.a6(), var3.h0(), var9);
            var7.n5(com.aspose.slides.internal.v6g.k5.n5(var10, com.aspose.slides.internal.b8c.x0.class));
            var6.n5(var10);
         }
      }

      if (var2 == 6 || var2 == 5) {
         var6.u9();
         var6.a0();
      }

      return var6;
   }

   public static void n5(String var0, String[] var1, String[] var2, String[] var3) {
      var1[0] = null;
      var2[0] = null;
      var3[0] = null;
      b0 var4 = new b0(var0, (b1)null);

      try {
         var4.u9();
         if (var4.k5("version")) {
            var1[0] = var4.z1();
         }

         if (var4.k5("encoding")) {
            var2[0] = var4.z1();
         }

         if (var4.k5("standalone")) {
            var3[0] = var4.z1();
         }
      } finally {
         var4.w1();
      }
   }

   public static Exception n5(int var0) {
      return new InvalidOperationException(
         com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.internal.x7n.l6.k5(), v3.n5("Unexpected XmlNodeType: '{0}'."), com.aspose.slides.ms.System.s3.n5(a4.class, var0)
         )
      );
   }
}
