package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.k1;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.s2;

public class e9 {
   private String l6;
   private String k5;
   private String u3;
   private j4 a6;
   private String u9;
   private byte[] h0;
   private com.aspose.slides.internal.o8m.f2 c8;
   private Object t2;
   private int s7;
   private m8 x8;
   private s0 n3 = null;
   public x8 n5 = null;

   public e9() {
      this.a6 = new j4();
      this.t2 = null;
      this.s7 = 2;
      this.x8 = null;
      this.u9 = "http://www.w3.org/2000/09/xmldsig#sha1";
   }

   public final String n5() {
      return this.l6;
   }

   public final String l6() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
      this.x8 = null;
   }

   public final void l6(String var1) {
      this.u3 = var1;
      this.x8 = null;
   }

   public final String k5() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
      this.x8 = null;
   }

   public final byte[] u3() {
      return this.h0;
   }

   public final void n5(byte[] var1) {
      this.h0 = var1;
      this.x8 = null;
   }

   public final j4 a6() {
      if (this.a6 == null) {
         this.a6 = new j4();
      }

      return this.a6;
   }

   public final void n5(j4 var1) {
      this.a6 = var1;
      this.x8 = null;
   }

   public final boolean u9() {
      return this.x8 != null;
   }

   public final s0 h0() {
      return this.n3;
   }

   public final void n5(s0 var1) {
      this.n3 = var1;
   }

   public final int c8() {
      return this.s7;
   }

   public final m8 t2() {
      if (this.u9()) {
         return this.x8;
      }

      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   public final m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("Reference", "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.l6)) {
         var2.k5("Id", this.l6);
      }

      if (this.k5 != null) {
         var2.k5("URI", this.k5);
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.u3)) {
         var2.k5("Type", this.u3);
      }

      if (this.a6().n5() != 0) {
         var2.appendChild(this.a6().n5(var1, "http://www.w3.org/2000/09/xmldsig#"));
      }

      if (com.aspose.slides.ms.System.d1.n5(this.u9)) {
         throw new CryptographicException("A DigestMethod must be specified on a Reference prior to generating XML.");
      }

      m8 var3 = var1.createElement("DigestMethod", "http://www.w3.org/2000/09/xmldsig#");
      var3.k5("Algorithm", this.u9);
      var2.appendChild(var3);
      if (this.u3() == null) {
         if (this.c8.n3() == null) {
            throw new CryptographicException("A Reference must contain a DigestValue.");
         }

         this.n5(this.c8.n3());
      }

      m8 var4 = var1.createElement("DigestValue", "http://www.w3.org/2000/09/xmldsig#");
      var4.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(this.h0)));
      var2.appendChild(var4);
      return var2;
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.l6 = i9.k5(var1, "Id", "http://www.w3.org/2000/09/xmldsig#");
      this.k5 = i9.k5(var1, "URI", "http://www.w3.org/2000/09/xmldsig#");
      this.u3 = i9.k5(var1, "Type", "http://www.w3.org/2000/09/xmldsig#");
      if (!i9.n5(var1, new String[]{"Id", "URI", "Type"})) {
         throw new CryptographicException("Malformed element {0}.", "Reference");
      }

      s2 var2 = new s2(var1.getOwnerDocument().getNameTable());
      var2.n5("ds", "http://www.w3.org/2000/09/xmldsig#");
      boolean var3 = false;
      this.n5(new j4());
      i0 var4 = var1.selectNodes("ds:Transforms", var2);
      if (var4 != null && var4.n5() != 0) {
         if (var4.n5() > 1) {
            throw new CryptographicException("Malformed element {0}.", "Reference/Transforms");
         }

         var3 = true;
         m8 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.k5(0), m8.class);
         if (!i9.n5(var5, com.aspose.slides.internal.v6g.k5.k5(null, String[].class))) {
            throw new CryptographicException("Malformed element {0}.", "Reference/Transforms");
         }

         i0 var6 = var5.selectNodes("ds:Transform", var2);
         if (var6 != null) {
            if (var6.n5() != var5.selectNodes("*").n5()) {
               throw new CryptographicException("Malformed element {0}.", "Reference/Transforms");
            }

            if (var6.n5() > 10) {
               throw new CryptographicException("Malformed element {0}.", "Reference/Transforms");
            }

            IEnumerator var7 = var6.iterator();

            try {
               while (var7.hasNext()) {
                  l0 var8 = (l0)var7.next();
                  m8 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, m8.class);
                  String var10 = i9.k5(var9, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
                  if (var10 == null || !i9.n5(var9, "Algorithm")) {
                     throw new CryptographicException("Unknown transform has been encountered.");
                  }

                  g7 var11 = z3.n5(g7.class, var10);
                  if (var11 == null) {
                     throw new CryptographicException("Unknown transform has been encountered.");
                  }

                  this.n5(var11);
                  var11.n5(var9.getChildNodes());
                  if (com.aspose.slides.internal.v6g.k5.l6(var11, s4.class)) {
                     l0 var12 = var9.selectSingleNode("ancestor::ds:Signature[1]", var2);
                     i0 var13 = var9.selectNodes("//ds:Signature", var2);
                     if (var13 != null) {
                        int var14 = 0;
                        IEnumerator var15 = var13.iterator();

                        try {
                           while (var15.hasNext()) {
                              l0 var16 = (l0)var15.next();
                              var14++;
                              if (var16 == var12) {
                                 ((s4)var11).n5(var14);
                                 break;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
                              ((IDisposable)var15).dispose();
                           }
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  ((IDisposable)var7).dispose();
               }
            }
         }
      }

      i0 var25 = var1.selectNodes("ds:DigestMethod", var2);
      if (var25 != null && var25.n5() != 0 && var25.n5() <= 1) {
         m8 var26 = com.aspose.slides.internal.v6g.k5.n5(var25.k5(0), m8.class);
         this.u9 = i9.k5(var26, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
         if (this.u9 != null && i9.n5(var26, "Algorithm")) {
            i0 var27 = var1.selectNodes("ds:DigestValue", var2);
            if (var27 != null && var27.n5() != 0 && var27.n5() <= 1) {
               m8 var28 = com.aspose.slides.internal.v6g.k5.n5(var27.k5(0), m8.class);
               this.h0 = com.aspose.slides.ms.System.z3.s7(i9.n5(var28.getInnerText()));
               if (!i9.n5(var28, com.aspose.slides.internal.v6g.k5.k5(null, String[].class))) {
                  throw new CryptographicException("Malformed element {0}.", "Reference/DigestValue");
               }

               int var29 = var3 ? 3 : 2;
               if (var1.selectNodes("*").n5() != var29) {
                  throw new CryptographicException("Malformed element {0}.", "Reference");
               }

               this.x8 = var1;
            } else {
               throw new CryptographicException("Malformed element {0}.", "Reference/DigestValue");
            }
         } else {
            throw new CryptographicException("Malformed element {0}.", "Reference/DigestMethod");
         }
      } else {
         throw new CryptographicException("Malformed element {0}.", "Reference/DigestMethod");
      }
   }

   public final void n5(g7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("transform");
      }

      var1.n5(this);
      this.a6().n5(var1);
   }

   public final void n5(XmlDocument var1, x8 var2) {
      this.n5(this.l6(var1, var2));
   }

   public final byte[] l6(XmlDocument var1, x8 var2) {
      this.c8 = z3.n5(com.aspose.slides.internal.o8m.f2.class, this.u9);
      if (this.c8 == null) {
         throw new CryptographicException("Could not create hash algorithm object.");
      }

      String var3 = var1 == null ? com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.p8.n5(), "\\"}) : var1.getBaseURI();
      com.aspose.slides.internal.z0k.t4 var4 = null;
      com.aspose.slides.internal.g8v.u8 var5 = null;
      com.aspose.slides.internal.z0k.t4 var6 = null;
      o8 var7 = null;
      byte[] var8 = null;

      try {
         switch (this.s7) {
            case 0:
               var7 = this.h0().n5() ? this.h0().l6 : new k1();
               var4 = this.a6().n5((com.aspose.slides.internal.z0k.t4)this.t2, var7, var3);
               break;
            case 1:
               var7 = this.h0().n5() ? this.h0().l6 : new k1();
               var4 = this.a6().n5(i9.n5((m8)this.t2, var7, var3), var7, var3);
               break;
            case 2:
               if (this.k5 == null) {
                  var7 = this.h0().n5() ? this.h0().l6 : new k1();
                  var4 = this.a6().n5((com.aspose.slides.internal.z0k.t4)null, var7, var3);
               } else if (this.k5.length() == 0) {
                  if (var1 == null) {
                     throw new CryptographicException(
                        com.aspose.slides.ms.System.d1.n5(
                           com.aspose.slides.internal.x7n.l6.u3(), "An XmlDocument context is required to resolve the Reference Uri {0}.",new Object[]{ this.k5
                        })
                     );
                  }

                  var7 = this.h0().n5() ? this.h0().l6 : new k1();
                  XmlDocument var32 = i9.n5(i9.n5(var1, var7, var3));
                  var4 = this.a6().n5(var32, var7, var3);
               } else {
                  if (this.k5.charAt(0) != '#') {
                     throw new CryptographicException("Unable to resolve Uri {0}.", this.k5);
                  }

                  boolean var9 = true;
                  boolean[] var10 = new boolean[]{true};
                  String var11 = i9.n5(this.k5, var10);
                  var9 = var10[0];
                  if ("xpointer(/)".equals(var11)) {
                     if (var1 == null) {
                        throw new CryptographicException(
                           com.aspose.slides.ms.System.d1.n5(
                              com.aspose.slides.internal.x7n.l6.u3(), "An XmlDocument context is required to resolve the Reference Uri {0}.",new Object[]{ this.k5
                           })
                        );
                     }

                     var7 = this.h0().n5() ? this.h0().l6 : new k1();
                     var4 = this.a6().n5(i9.n5(var1, var7, var3), var7, var3);
                  } else {
                     m8 var12 = this.h0().n5(var1, var11);
                     if (var12 != null) {
                        this.n5 = i9.n5(com.aspose.slides.internal.v6g.k5.n5(var12.getParentNode(), m8.class));
                     }

                     if (var12 == null && var2 != null) {
                        IEnumerator var13 = var2.iterator();

                        try {
                           while (var13.hasNext()) {
                              l0 var14 = (l0)var13.next();
                              m8 var15 = com.aspose.slides.internal.v6g.k5.n5(var14, m8.class);
                              if (var15 != null
                                 && i9.u3(var15, "Id", "http://www.w3.org/2000/09/xmldsig#")
                                 && com.aspose.slides.ms.System.d1.a6(i9.k5(var15, "Id", "http://www.w3.org/2000/09/xmldsig#"), var11)) {
                                 var12 = var15;
                                 if (this.n3.k5 != null) {
                                    this.n5 = i9.n5(this.n3.k5);
                                 }
                                 break;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                              ((IDisposable)var13).dispose();
                           }
                        }
                     }

                     if (var12 == null) {
                        throw new CryptographicException("Malformed reference element.");
                     }

                     XmlDocument var33 = i9.n5(var12, var7, var3);
                     i9.n5(var33.getDocumentElement(), this.n5);
                     var7 = this.h0().n5() ? this.h0().l6 : new k1();
                     if (var9) {
                        XmlDocument var34 = i9.n5(var33);
                        var4 = this.a6().n5(var34, var7, var3);
                     } else {
                        var4 = this.a6().n5(var33, var7, var3);
                     }
                  }
               }
               break;
            default:
               throw new CryptographicException("Unable to resolve Uri {0}.", this.k5);
         }

         var8 = this.c8.n5(var4);
      } finally {
         if (var4 != null) {
            var4.close();
         }

         if (var5 != null) {
            var5.h0();
         }

         if (var6 != null) {
            var6.close();
         }
      }

      return (byte[])var8;
   }
}
