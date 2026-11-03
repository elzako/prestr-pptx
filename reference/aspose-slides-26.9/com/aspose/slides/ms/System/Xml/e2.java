package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlSchemaValidationException;
import com.aspose.slides.internal.b8c.d8;
import com.aspose.slides.internal.b8c.e4j;
import com.aspose.slides.internal.b8c.j2;
import com.aspose.slides.internal.b8c.j9e;
import com.aspose.slides.internal.b8c.k0t;
import com.aspose.slides.internal.b8c.k9;
import com.aspose.slides.internal.b8c.k9m;
import com.aspose.slides.internal.b8c.l2;
import com.aspose.slides.internal.b8c.l9;
import com.aspose.slides.internal.b8c.v1;
import com.aspose.slides.internal.b8c.v7u;
import com.aspose.slides.internal.b8c.x4;
import com.aspose.slides.ms.System.IDisposable;

public final class e2 implements a3 {
   private v7u n5;
   private k0t l6;
   private s2 k5;
   private z9 u3;
   private ArrayList a6;
   private k9m u9;
   private j2 h0;
   private j2 c8;
   private com.aspose.slides.internal.b8c.b4 t2;
   private com.aspose.slides.internal.b8c.b4 s7;
   private l0 x8;
   private l0 n3;
   private XmlDocument y4;
   private l0[] e2;
   private boolean t9;
   private boolean z1;
   private boolean t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;

   public e2(XmlDocument var1, k0t var2, com.aspose.slides.internal.b8c.b4 var3) {
      this.l6 = var2;
      this.t2 = var3;
      this.y4 = var1;
      this.s7 = new t9(this);
      this.u3 = this.y4.getNameTable();
      this.k5 = new s2(this.u3);
      this.u9 = new z1(this);
      this.z1 = true;
      this.q0 = this.u3.n5("http://www.w3.org/2000/xmlns/");
      this.z3 = this.u3.n5("http://www.w3.org/2001/XMLSchema-instance");
      this.m1 = this.u3.n5("type");
      this.k7 = this.u3.n5("nil");
   }

   public final boolean n5(l0 var1) {
      x4 var2 = null;
      byte var3 = 16;
      this.x8 = var1;
      switch (var1.getNodeType()) {
         case 1:
            com.aspose.slides.internal.b8c.u4 var4 = var1.getSchemaInfo();
            v1 var5 = var4.an_();
            if (var5 != null) {
               if (!var5.q0().k5()) {
                  var2 = this.l6.a6().k5(var5.z8());
               } else {
                  var2 = var5;
               }
            } else {
               var2 = var4.am_();
               if (var2 == null) {
                  if (var1.getParentNode().getNodeType() == 9) {
                     var1 = var1.getParentNode();
                  } else {
                     var2 = this.l6(com.aspose.slides.internal.v6g.k5.n5(var1, m8.class));
                     if (var2 == null) {
                        throw new XmlSchemaValidationException(
                           "Schema information could not be found for the node passed into Validate. The node may be invalid in its current position. Navigate to the ancestor that has Schema information, then call Validate again.",
                           null,
                           var1
                        );
                     }
                  }
               }
            }
            break;
         case 2:
            if (var1.getXPNodeType() == 3) {
               throw new InvalidOperationException(
                  v3.n5("Validate method can be called only on nodes of type Document, DocumentFragment, Element, or Attribute.", null)
               );
            }

            var2 = var1.getSchemaInfo().ao_();
            if (var2 == null) {
               var2 = this.n5(com.aspose.slides.internal.v6g.k5.n5(var1, u8.class));
               if (var2 == null) {
                  throw new XmlSchemaValidationException(
                     "Schema information could not be found for the node passed into Validate. The node may be invalid in its current position. Navigate to the ancestor that has Schema information, then call Validate again.",
                     null,
                     var1
                  );
               }
            }
            break;
         case 9:
            var3 |= 8;
         case 11:
            break;
         default:
            throw new InvalidOperationException(
               v3.n5("Validate method can be called only on nodes of type Document, DocumentFragment, Element, or Attribute.", null)
            );
      }

      this.t4 = true;
      this.n5(var2, var3);
      if (this.z1) {
         if (this.c8 == null) {
            this.c8 = new j2();
         }

         this.h0 = new j2();
      }

      this.l6(var1);
      this.n5.l6();
      return this.t4;
   }

   @Override
   public final IGenericDictionary<String, String> n5(int var1) {
      IGenericDictionary var2 = this.k5.n5(var1);
      if (var1 != 2) {
         l0 var3 = this.x8;

         while (var3 != null) {
            switch (var3.getNodeType()) {
               case 1:
                  m8 var4 = (m8)var3;
                  if (var4.s7()) {
                     w5 var5 = var4.getAttributes();

                     for (int var6 = 0; var6 < var5.l6(); var6++) {
                        u8 var7 = var5.n5(var6);
                        if (v8.n5(var7.getNamespaceURI(), this.y4.strReservedXmlns)) {
                           if (var7.getPrefix().length() == 0) {
                              if (!var2.containsKey(com.aspose.slides.ms.System.d1.n5)) {
                                 var2.addItem(com.aspose.slides.ms.System.d1.n5, var7.getValue());
                              }
                           } else if (!var2.containsKey(var7.getLocalName())) {
                              var2.addItem(var7.getLocalName(), var7.getValue());
                           }
                        }
                     }
                  }

                  var3 = var3.getParentNode();
                  break;
               case 2:
                  var3 = ((u8)var3).u9();
                  break;
               default:
                  var3 = var3.getParentNode();
            }
         }
      }

      return var2;
   }

   @Override
   public final String n5(String var1) {
      String var2 = this.k5.n5(var1);
      if (var2 == null) {
         var2 = this.x8.getNamespaceOfPrefixStrict(var1);
      }

      return var2;
   }

   @Override
   public final String l6(String var1) {
      String var2 = this.k5.l6(var1);
      if (var2 == null) {
         var2 = this.x8.getPrefixOfNamespaceStrict(var1);
      }

      return var2;
   }

   private a3 n5() {
      return this.x8 == this.y4 ? this.k5 : this;
   }

   private void n5(x4 var1, int var2) {
      this.n5 = new v7u(this.u3, this.l6, this.n5(), var2);
      this.n5.n5(f4.z8(this.y4.getBaseURI()));
      this.n5.n5((o8)null);
      this.n5.l6.l6(this.s7);
      this.n5.n5(this);
      if (var1 != null) {
         this.n5.n5(var1);
      } else {
         this.n5.n5();
      }
   }

   private void l6(l0 var1) {
      this.n3 = var1;
      switch (this.n3.getNodeType()) {
         case 1:
            this.l6();
            break;
         case 2:
            u8 var4 = com.aspose.slides.internal.v6g.k5.n5(this.n3, u8.class);
            this.n5.n5(var4.getLocalName(), var4.getNamespaceURI(), this.u9, this.h0);
            if (this.z1) {
               var4.n5(this.y4.addAttrXmlName(var4.getPrefix(), var4.getLocalName(), var4.getNamespaceURI(), this.h0));
            }
            break;
         case 3:
            this.n5.n5(this.u9);
            break;
         case 4:
            this.n5.n5(this.u9);
            break;
         case 5:
         case 11:
            for (l0 var3 = var1.getFirstChild(); var3 != null; var3 = var3.getNextSibling()) {
               this.l6(var3);
            }
            break;
         case 6:
         case 10:
         case 12:
         default:
            throw new InvalidOperationException(v3.n5("Unexpected XmlNodeType: '{0}'.", com.aspose.slides.ms.System.s3.n5(a4.class, this.n3.getNodeType())));
         case 7:
         case 8:
            break;
         case 9:
            m8 var2 = ((XmlDocument)var1).getDocumentElement();
            if (var2 == null) {
               throw new InvalidOperationException(v3.n5("Invalid XML document. {0}", v3.n5("The document does not have a root element.")));
            }

            this.l6((l0)var2);
            break;
         case 13:
         case 14:
            this.n5.l6(this.u9);
      }
   }

   private void l6() {
      this.k5.k5();
      m8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n3, m8.class);
      w5 var2 = var1.getAttributes();
      u8 var3 = null;
      String var4 = null;
      String var5 = null;

      for (int var6 = 0; var6 < var2.l6(); var6++) {
         var3 = var2.n5(var6);
         String var7 = var3.getNamespaceURI();
         String var8 = var3.getLocalName();
         if (v8.n5(var7, this.z3)) {
            if (v8.n5(var8, this.m1)) {
               var5 = var3.getValue();
            } else if (v8.n5(var8, this.k7)) {
               var4 = var3.getValue();
            }
         } else if (v8.n5(var7, this.q0)) {
            this.k5.n5(var3.getPrefix().length() == 0 ? com.aspose.slides.ms.System.d1.n5 : var3.getLocalName(), var3.getValue());
         }
      }

      this.n5.n5(var1.getLocalName(), var1.getNamespaceURI(), this.c8, var5, var4, null, null);
      this.n5(var1);
      this.n5.n5(this.c8);

      for (l0 var10 = var1.getFirstChild(); var10 != null; var10 = var10.getNextSibling()) {
         this.l6(var10);
      }

      this.n3 = var1;
      this.n5.l6(this.c8);
      if (this.z1) {
         var1.n5(this.y4.addXmlName(var1.getPrefix(), var1.getLocalName(), var1.getNamespaceURI(), this.c8));
         if (this.c8.l6()) {
            t0 var11 = this.y4.createTextNode(this.c8.an_().a0().d5());
            var1.appendChild(var11);
         }
      }

      this.k5.u3();
   }

   private void n5(m8 var1) {
      w5 var2 = var1.getAttributes();
      u8 var3 = null;

      for (int var4 = 0; var4 < var2.l6(); var4++) {
         var3 = var2.n5(var4);
         this.n3 = var3;
         if (!v8.n5(var3.getNamespaceURI(), this.q0)) {
            this.n5.n5(var3.getLocalName(), var3.getNamespaceURI(), this.u9, this.h0);
            if (this.z1) {
               var3.n5(this.y4.addAttrXmlName(var3.getPrefix(), var3.getLocalName(), var3.getNamespaceURI(), this.h0));
            }
         }
      }

      if (this.z1) {
         if (this.a6 == null) {
            this.a6 = new ArrayList();
         } else {
            this.a6.clear();
         }

         this.n5.n5(this.a6);
         l2 var11 = null;
         var3 = null;

         for (int var5 = 0; var5 < this.a6.size(); var5++) {
            var11 = com.aspose.slides.internal.v6g.k5.n5(this.a6.get_Item(var5), l2.class);
            k6 var6 = var11.n3();
            var3 = this.y4.createDefaultAttribute(this.k5(var6.n5()), var6.l6(), var6.n5());
            this.n5(var11);
            var3.n5(this.y4.addAttrXmlName(var3.getPrefix(), var3.getLocalName(), var3.getNamespaceURI(), this.h0));
            var3.appendChild(this.y4.createTextNode(var11.t9().d5()));
            var2.l6(var3);
            o4 var7 = com.aspose.slides.internal.v6g.k5.n5(var3, o4.class);
            if (var7 != null) {
               var7.n5(false);
            }
         }
      }
   }

   private void n5(l2 var1) {
      this.h0.s7();
      this.h0.n5(true);
      this.h0.l6(false);
      this.h0.n5((j9e)var1.y4());
      this.h0.n5(var1);
      com.aspose.slides.internal.b8c.h9 var2 = var1.t9();
      if (var2.a0().x8() == 2) {
         e4j var3 = com.aspose.slides.internal.v6g.k5.n5(var2.s3(), e4j.class);
         this.h0.n5(var3.n5());
      }

      this.h0.n5(1);
   }

   private String k5(String var1) {
      IGenericDictionary var2 = this.n5().n5(0);
      String var3 = null;
      var1 = this.u3.n5(var1);
      IGenericEnumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            String var6 = this.u3.n5((String)var5.getValue());
            if (com.aspose.slides.ms.System.j8.l6(var6, var1)) {
               var3 = (String)var5.getKey();
               if (var3.length() != 0) {
                  return var3;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }

   private Object k5() {
      return this.n3.getValue();
   }

   private x4 l6(m8 var1) {
      this.t9 = true;
      com.aspose.slides.internal.b8c.u4 var2 = null;
      int var3 = 0;
      l0 var4 = var1.getParentNode();

      do {
         var2 = var4.getSchemaInfo();
         if (var2.an_() != null || var2.am_() != null) {
            break;
         }

         this.l6(var3);
         this.e2[var3++] = var4;
         var4 = var4.getParentNode();
      } while (var4 != null);

      if (var4 == null) {
         this.e2[--var3] = null;
         return this.n5(var1, null, var3);
      }

      this.l6(var3);
      this.e2[var3++] = var4;
      d8 var5 = var2.an_();
      if (var5 == null) {
         var5 = var2.am_();
      }

      return this.n5(var1, var5, var3);
   }

   private void l6(int var1) {
      if (this.e2 == null) {
         this.e2 = new l0[4];
      } else if (var1 >= this.e2.length - 1) {
         l0[] var2 = new l0[this.e2.length * 2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.e2)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, this.e2.length);
         this.e2 = var2;
      }
   }

   private l2 n5(u8 var1) {
      m8 var2 = var1.u9();
      x4 var3 = this.l6(var2);
      l9 var4 = this.l6(var3);
      if (var4 == null) {
         return null;
      }

      k6 var5 = new k6(var1.getLocalName(), var1.getNamespaceURI());
      l2 var6 = com.aspose.slides.internal.v6g.k5.n5(var4.m1().k5(var5), l2.class);
      if (var6 == null) {
         k9 var7 = var4.k7();
         if (var7 != null && var7.l6().n5(var5)) {
            var6 = com.aspose.slides.internal.v6g.k5.n5(this.l6.u9().k5(var5), l2.class);
         }
      }

      return var6;
   }

   private x4 n5(m8 var1, x4 var2, int var3) {
      this.n5 = this.k5(var2);
      this.c8 = new j2();
      int var4 = var3 - 1;
      boolean var5 = this.n5(var2);

      for (int var6 = var4; var6 >= 0; var6--) {
         l0 var7 = this.e2[var6];
         m8 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, m8.class);
         this.n5(var8, false, this.c8);
         if (!var5) {
            var8.n5(this.y4.addXmlName(var8.getPrefix(), var8.getLocalName(), var8.getNamespaceURI(), this.c8));
            var5 = this.n5(this.c8.an_());
         }

         this.n5.n5((j2)null);
         if (var6 > 0) {
            this.n5(var7, this.e2[var6 - 1]);
         } else {
            this.n5(var7, var1);
         }
      }

      this.n5(var1, false, this.c8);
      x4 var9 = null;
      if (this.c8.an_() != null) {
         var9 = this.c8.an_();
      } else {
         var9 = this.c8.am_();
      }

      if (var9 == null) {
         if (this.n5.u9() == 1) {
            if (this.t9) {
               return l9.u9();
            }
         } else if (this.n5.u9() == 2) {
            return l9.n5();
         }
      }

      return var9;
   }

   private boolean n5(x4 var1) {
      l9 var2 = this.l6(var1);
      return var1 != null ? var2.z8() : false;
   }

   private l9 l6(x4 var1) {
      if (var1 == null) {
         return null;
      }

      v1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, v1.class);
      l9 var3 = null;
      if (var2 != null) {
         var3 = com.aspose.slides.internal.v6g.k5.n5(var2.j5(), l9.class);
      } else {
         var3 = com.aspose.slides.internal.v6g.k5.n5(var1, l9.class);
      }

      return var3;
   }

   private void n5(m8 var1, boolean var2, j2 var3) {
      this.k5.k5();
      w5 var4 = var1.getAttributes();
      u8 var5 = null;
      String var6 = null;
      String var7 = null;

      for (int var8 = 0; var8 < var4.l6(); var8++) {
         var5 = var4.n5(var8);
         String var9 = var5.getNamespaceURI();
         String var10 = var5.getLocalName();
         if (v8.n5(var9, this.z3)) {
            if (v8.n5(var10, this.m1)) {
               var7 = var5.getValue();
            } else if (v8.n5(var10, this.k7)) {
               var6 = var5.getValue();
            }
         } else if (v8.n5(var9, this.q0)) {
            this.k5.n5(var5.getPrefix().length() == 0 ? com.aspose.slides.ms.System.d1.n5 : var5.getLocalName(), var5.getValue());
         }
      }

      this.n5.n5(var1.getLocalName(), var1.getNamespaceURI(), var3, var7, var6, null, null);
      if (var2) {
         this.n5.n5(var3);
         this.n5.k5(var3);
         this.k5.u3();
      }
   }

   private void n5(l0 var1, l0 var2) {
      for (l0 var3 = var1.getFirstChild(); var3 != null && var3 != var2; var3 = var3.getNextSibling()) {
         switch (var3.getNodeType()) {
            case 1:
               this.n5(com.aspose.slides.internal.v6g.k5.n5(var3, m8.class), true, null);
               break;
            case 2:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               throw new InvalidOperationException(v3.n5("Unexpected XmlNodeType: '{0}'.", com.aspose.slides.ms.System.s3.n5(a4.class, this.n3.getNodeType())));
            case 3:
            case 4:
               this.n5.n5(var3.getValue());
               break;
            case 5:
               this.n5(var3, var2);
            case 7:
            case 8:
               break;
            case 13:
            case 14:
               this.n5.l6(var3.getValue());
         }
      }
   }

   private v7u k5(x4 var1) {
      v7u var2 = new v7u(this.y4.getNameTable(), this.y4.getSchemas(), this.k5, 0);
      var2.l6.l6(new t4(this));
      if (var1 != null) {
         var2.n5(var1);
      } else {
         var2.n5();
      }

      return var2;
   }

   private void n5(Object var1, com.aspose.slides.internal.b8c.i0 var2) {
      if (var2.n5() == 0) {
         this.t9 = false;
      }
   }

   private void l6(Object var1, com.aspose.slides.internal.b8c.i0 var2) {
      if (var2.n5() == 0) {
         this.t4 = false;
      }

      XmlSchemaValidationException var3 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), XmlSchemaValidationException.class);
      var3.setSourceObject(this.n3);
      if (this.t2 != null) {
         this.t2.n5(var1, var2);
      } else if (var2.n5() == 0) {
         throw var3;
      }
   }

   // $VF: synthetic method
   static void n5(e2 var0, Object var1, com.aspose.slides.internal.b8c.i0 var2) {
      var0.l6(var1, var2);
   }

   // $VF: synthetic method
   static Object n5(e2 var0) {
      return var0.k5();
   }

   // $VF: synthetic method
   static void l6(e2 var0, Object var1, com.aspose.slides.internal.b8c.i0 var2) {
      var0.n5(var1, var2);
   }
}
