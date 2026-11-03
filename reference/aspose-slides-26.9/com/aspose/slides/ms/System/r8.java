package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.UriFormatException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@j3
public class r8 {
   private boolean t9;
   private String z1;
   private String t4;
   private String q0;
   private int z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private boolean j5;
   private boolean w1;
   private boolean r4;
   private long c4;
   private List<String> y2;
   private boolean y1;
   private String a0;
   private String d2;
   private String d5;
   private int s3;
   private static String p8 = "0123456789ABCDEF";
   private static String[] f2 = new String[0];
   private static boolean i1 = com.aspose.slides.internal.z0k.z1.k5 == '\\';
   public static String n5 = "://";
   public static String l6 = "file";
   public static String k5 = "ftp";
   public static String u3 = "gopher";
   public static String a6 = "http";
   public static String u9 = "https";
   public static String h0 = "mailto";
   public static String c8 = "news";
   public static String t2 = "nntp";
   public static String s7 = "net.pipe";
   public static String x8 = "net.tcp";
   private static final String e5 = d1.n5(new String[]{"<>%\"{}|\\^`", "[]", "?"});
   private static final String b3 = d1.n5(new String[]{"<>%\"{}|\\^`", "#"});
   private static final String o0 = d1.n5(new String[]{"<>%\"{}|\\^`", "[]"});
   static final String n3 = d1.n5(new String[]{"<>%\"{}|\\^`", "#", "[]"});
   static final String y4 = d1.n5(new String[]{n3, "?"});
   static r8$l6[] e2 = new r8$l6[]{
      new r8$l6(a6, n5, 80),
      new r8$l6(u9, n5, 443),
      new r8$l6(k5, n5, 21),
      new r8$l6(l6, n5, -1),
      new r8$l6(h0, ":", 25),
      new r8$l6(c8, ":", 119),
      new r8$l6(t2, n5, 119),
      new r8$l6(u3, n5, 70)
   };
   @e9
   private y5 z7;

   public r8(String var1) {
      this(var1, false);
   }

   public r8(String var1, int var2) {
      this.t4 = d1.n5;
      this.q0 = d1.n5;
      this.z3 = -1;
      this.m1 = d1.n5;
      this.k7 = d1.n5;
      this.m3 = d1.n5;
      this.r4 = true;
      this.z1 = var1;
      this.n5(var2, r8$n5.n5);
      switch (var2) {
         case 0:
            break;
         case 1:
            if (!this.z3()) {
               throw new UriFormatException(d1.n5(new String[]{"Invalid URI: The format of the URI could not be ", "determined."}));
            }
            break;
         case 2:
            if (this.z3()) {
               throw new UriFormatException(
                  d1.n5(new String[]{"Invalid URI: The format of the URI could not be ", "determined because the parameter 'uriString' represents an absolute URI."})
               );
            }
            break;
         default:
            String var3 = d1.n5("Invalid UriKind value '{0}'.", new Object[]{var2});
            throw new ArgumentException(var3);
      }
   }

   private r8(String var1, int var2, boolean[] var3, r8$n5 var4) {
      this.t4 = d1.n5;
      this.q0 = d1.n5;
      this.z3 = -1;
      this.m1 = d1.n5;
      this.k7 = d1.n5;
      this.m3 = d1.n5;
      this.r4 = true;
      if (var1 == null) {
         var3[0] = false;
      } else {
         if (var2 != 0 && var2 != 1 && var2 != 2) {
            String var5 = d1.n5("Invalid UriKind value '{0}'.", new Object[]{var2});
            throw new ArgumentException(var5);
         }

         this.z1 = var1;
         if (this.l6(var2, var1, var4) != null) {
            var3[0] = false;
         } else {
            var3[0] = true;
            if (!this.y1) {
               this.q0 = n5(this.q0, b3, false);
               if (this.q0.length() > 1 && this.q0.charAt(0) != '[' && this.q0.charAt(this.q0.length() - 1) != ']') {
                  this.q0 = d1.n5(this.q0, com.aspose.slides.internal.x7n.l6.k5());
               }

               if (this.r4 && this.m1.length() > 0) {
                  this.m1 = a6(this.m1);
               }
            }

            switch (var2) {
               case 0:
                  break;
               case 1:
                  if (!this.z3()) {
                     var3[0] = false;
                  }
                  break;
               case 2:
                  if (this.z3()) {
                     var3[0] = false;
                  }
                  break;
               default:
                  var3[0] = false;
            }
         }
      }
   }

   @Deprecated
   public r8(String var1, boolean var2) {
      this.t4 = d1.n5;
      this.q0 = d1.n5;
      this.z3 = -1;
      this.m1 = d1.n5;
      this.k7 = d1.n5;
      this.m3 = d1.n5;
      this.r4 = true;
      this.y1 = var2;
      this.z1 = var1;
      this.n5(1, r8$n5.n5);
      if (!this.r4) {
         throw new UriFormatException(d1.n5(new String[]{"Invalid URI: The format of the URI could not be ", "determined: ", var1}));
      }
   }

   public r8(r8 var1, String var2) {
      this.t4 = d1.n5;
      this.q0 = d1.n5;
      this.z3 = -1;
      this.m1 = d1.n5;
      this.k7 = d1.n5;
      this.m3 = d1.n5;
      this.r4 = true;
      this.n5(var1, var2);
   }

   private static boolean n3(String var0) {
      if (var0.length() > 2 && var0.matches("[a-zA-Z]:.*") && !var0.matches("[a-zA-Z]:\\\\.*") && !var0.matches("[a-zA-Z]:/.*")) {
         throw new UriFormatException();
      }

      if (var0.matches("[a-zA-Z]\\|.*")) {
         throw new UriFormatException();
      }

      if (var0.length() <= 3 || !var0.startsWith("/") && !var0.startsWith("\\") || !var0.matches("[\\\\]{2}[\\\\/]+.*") && !var0.matches("[\\\\/]+/@[^/]*")) {
         if (var0.matches("//[a-zA-Z].*")) {
            return true;
         } else if (var0.matches("//.*")) {
            throw new UriFormatException();
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private void n5(r8 var1, String var2) {
      if (var1 == null) {
         throw new ArgumentNullException("baseUri");
      }

      if (!var1.z3()) {
         throw new ArgumentOutOfRangeException("baseUri");
      }

      if (var2 == null) {
         var2 = d1.n5;
      }

      if (!n3(var2) && var2.matches("\\\\.*")) {
         if (var2.length() > 2 && var2.matches("\\\\\\\\[a-zA-Z]+.*")) {
            this.z1 = var2;
            this.n5(1, r8$n5.n5);
         } else {
            throw new UriFormatException();
         }
      } else {
         int var3 = d1.u3(var2, ':');
         if (var3 != -1) {
            int var4 = d1.n5(var2, new char[]{'/', '\\', '?'});
            if (var4 > var3 || var4 < 0) {
               if (d1.l6(var1.t9(), 0, var2, 0, var3) != 0 || !k7(var1.t9()) || var2.length() > var3 + 1 && var2.charAt(var3 + 1) == '/') {
                  r8 var5 = null;
                  r8[] var6 = new r8[]{var5};
                  boolean var7 = n5(var2, 1, var6);
                  var5 = var6[0];
                  if (var7) {
                     this.z1 = var2;
                     this.n5(1, r8$n5.n5);
                     return;
                  }
               } else {
                  var2 = d1.k5(var2, var3 + 1);
               }
            }
         }

         this.t4 = var1.t4;
         this.q0 = var1.q0;
         this.z3 = var1.z3;
         this.z8 = var1.z8;
         this.j5 = var1.j5;
         this.t9 = var1.t9;
         this.w1 = var1.w1;
         if (var2.length() == 0) {
            this.m1 = var1.m1;
            this.k7 = var1.k7;
            this.m3 = var1.m3;
         } else {
            String var14 = d1.n5;
            var3 = d1.u3(var2, '#');
            if (var3 != -1) {
               var14 = d1.k5(var2, var3);
               if (this.y1) {
                  this.m3 = var14;
               } else {
                  this.m3 = d1.n5(new String[]{"#", a6(d1.k5(var2, var3 + 1))});
               }

               var2 = var3 == 0 ? d1.n5 : d1.l6(var2, 0, var3);
            }

            boolean var16 = false;
            var3 = d1.u3(var2, '?');
            if (var3 != -1) {
               this.k7 = d1.k5(var2, var3);
               if (!this.y1) {
                  this.k7 = a6(this.k7);
               }

               var16 = this.k7.length() > 0;
               var2 = var3 == 0 ? d1.n5 : d1.l6(var2, 0, var3);
            } else if (var2.length() == 0) {
               this.k7 = var1.k7;
            }

            if (var2.length() <= 0 || var2.charAt(0) != '/') {
               this.m1 = var1.m1;
               if (var2.length() > 0 || var16) {
                  var3 = d1.k5(this.m1, '/');
                  if (var3 >= 0) {
                     this.m1 = d1.l6(this.m1, 0, var3 + 1);
                  }
               }

               if (var2.length() == 0) {
                  this.z1 = d1.n5(new String[]{this.n5(1), this.k7, var14});
               } else {
                  this.m1 = d1.n5(this.m1, var2);
                  int var17 = 0;

                  while (true) {
                     var3 = d1.n5(this.m1, "./", var17);
                     if (var3 == -1) {
                        if (this.m1.length() > 1 && this.m1.charAt(this.m1.length() - 1) == '.' && this.m1.charAt(this.m1.length() - 2) == '/') {
                           this.m1 = d1.n5(this.m1, this.m1.length() - 1, 1);
                        }

                        var17 = 0;

                        while (true) {
                           var3 = d1.n5(this.m1, "/../", var17);
                           if (var3 == -1) {
                              if (this.m1.length() > 3 && d1.k5(this.m1, "/..")) {
                                 var3 = d1.n5(this.m1, '/', this.m1.length() - 4);
                                 if (var3 != -1 && !"..".equals(d1.l6(this.m1, var3 + 1, this.m1.length() - var3 - 4))) {
                                    this.m1 = d1.n5(this.m1, var3 + 1, this.m1.length() - var3 - 1);
                                 }
                              }

                              while (d1.n5(this.m1, "/../", (short)4)) {
                                 this.m1 = d1.k5(this.m1, 3);
                              }

                              if (!this.y1) {
                                 this.m1 = a6(this.m1);
                              }

                              this.z1 = d1.n5(new String[]{this.n5(1), this.m1, this.k7, var14});
                              return;
                           }

                           if (var3 == 0) {
                              var17 = 3;
                           } else {
                              int var19 = d1.n5(this.m1, '/', var3 - 1);
                              if (var19 == -1) {
                                 var17 = var3 + 1;
                              } else if (!"..".equals(d1.l6(this.m1, var19 + 1, var3 - var19 - 1))) {
                                 this.m1 = d1.n5(this.m1, var19 + 1, var3 - var19 + 3);
                              } else {
                                 var17 = var3 + 1;
                              }
                           }
                        }
                     }

                     if (var3 == 0) {
                        this.m1 = d1.n5(this.m1, 0, 2);
                     } else if (this.m1.charAt(var3 - 1) != '.') {
                        this.m1 = d1.n5(this.m1, var3, 2);
                     } else {
                        var17 = var3 + 1;
                     }
                  }
               }
            } else if (var2.length() > 1 && var2.charAt(1) == '/') {
               this.z1 = d1.n5(this.t4, ':', var2);
               this.n5(1, r8$n5.n5);
            } else {
               this.m1 = var2;
               if (!this.y1) {
                  this.m1 = a6(this.m1);
               }
            }
         }
      }
   }

   public String n5() {
      this.r4();
      if (this.m1.length() == 0) {
         String var1 = d1.n5(new String[]{this.t4, n5});
         return !d1.n5(this.m1, var1, (short)4) && !"file".equals(this.t4) ? d1.n5 : "/";
      } else {
         return !"mailto".equals(this.t4) && !"file".equals(this.t4) ? this.m1 : this.m1;
      }
   }

   public String l6() {
      this.r4();
      if (this.a0 == null) {
         this.a0 = this.n5(2);
         if (this.k7.length() > 0) {
            this.a0 = d1.n5(this.a0, this.k7);
         }

         if (this.m3.length() > 0) {
            this.a0 = d1.n5(this.a0, this.m3);
         }
      }

      return this.a0;
   }

   public String k5() {
      this.r4();
      return c8(this.t9()) == this.z3 ? this.q0 : d1.n5(new Object[]{this.q0, ":", this.z3});
   }

   public String u3() {
      this.r4();
      return this.m3;
   }

   public String a6() {
      this.r4();
      return this.q0;
   }

   public int u9() {
      this.r4();
      int var1 = n5(this.a6());
      if (var1 != 0) {
         return var1;
      } else if ("mailto".equals(this.t4)) {
         return 1;
      } else if (this.q0 != null && this.q0.length() > 0) {
         return 1;
      } else {
         return this.c8() ? 1 : var1;
      }
   }

   public boolean h0() {
      this.r4();
      return c8(this.t9()) == this.z3;
   }

   public boolean c8() {
      this.r4();
      return d1.a6(this.t9(), l6);
   }

   public boolean t2() {
      this.r4();
      if (this.a6().length() == 0) {
         return this.c8();
      }

      if (!"loopback".equals(this.q0) && !"localhost".equals(this.q0)) {
         Object var1 = null;
         com.aspose.slides.internal.a6z.n5[] var2 = new com.aspose.slides.internal.a6z.n5[]{(com.aspose.slides.internal.a6z.n5)var1};
         boolean var3 = com.aspose.slides.internal.a6z.n5.n5(this.q0, var2);
         com.aspose.slides.internal.a6z.n5 var7 = var2[0];
         if (var3 && com.aspose.slides.internal.a6z.n5.k5.equals(var7)) {
            return true;
         }

         com.aspose.slides.internal.a6z.l6 var4 = null;
         com.aspose.slides.internal.a6z.l6[] var5 = new com.aspose.slides.internal.a6z.l6[]{var4};
         boolean var6 = com.aspose.slides.internal.a6z.l6.n5(this.q0, var5);
         var4 = var5[0];
         return var6 && com.aspose.slides.internal.a6z.l6.n5(var4);
      } else {
         return true;
      }
   }

   public boolean s7() {
      this.r4();
      return this.j5;
   }

   private boolean m3() {
      if (this.c8()) {
         return false;
      } else {
         return !d1.a6(this.t4, c8) && !d1.a6(this.t4, t2) && !d1.a6(this.t4, k5) ? this.k7() : false;
      }
   }

   public String x8() {
      this.r4();
      if (this.d5 != null) {
         return this.d5;
      }

      if (this.m3()) {
         this.d5 = this.u9(this.n5());
         return this.d5;
      }

      if (!this.s7()) {
         String var1 = this.u9(k5(this.m1, false));
         boolean var2 = this.m1.length() > 3 && this.m1.charAt(1) == ':' && (this.m1.charAt(2) == '\\' || this.m1.charAt(2) == '/');
         if (var2) {
            this.d5 = d1.n5(var1, '/', '\\');
         } else {
            this.d5 = var1;
         }
      } else if (this.m1.length() > 1 && this.m1.charAt(1) == ':') {
         this.d5 = this.u9(d1.n5(this.m1, com.aspose.slides.internal.z0k.z1.l6, com.aspose.slides.internal.z0k.z1.k5));
      } else if (com.aspose.slides.internal.z0k.z1.k5 == '\\') {
         String var3 = this.q0;
         if (this.m1.length() > 0) {
            if (this.m1.length() > 1 || this.m1.charAt(0) != '/') {
               var3 = d1.n5(var3, d1.n5(this.m1, '/', '\\'));
            }

            if (d1.k5(this.z1, "/") && !d1.k5(var3, "\\")) {
               var3 = d1.n5(var3, "\\");
            }
         }

         this.d5 = d1.n5(new String[]{"\\\\", this.u9(var3)});
      } else {
         this.d5 = this.u9(this.m1);
      }

      if (this.d5.length() == 0) {
         this.d5 = com.aspose.slides.ms.System.t9.q0(com.aspose.slides.internal.z0k.z1.k5);
      }

      return this.d5;
   }

   public String n3() {
      this.r4();
      return d1.n5(new String[]{this.m1, this.e2()});
   }

   public int y4() {
      this.r4();
      return this.z3;
   }

   public String e2() {
      this.r4();
      return this.k7;
   }

   public String t9() {
      this.r4();
      return this.t4;
   }

   public String[] z1() {
      this.r4();
      if (this.m1.length() == 0) {
         return f2;
      }

      if (this.y2 != null) {
         String[] var5 = new String[this.y2.size()];

         for (int var6 = 0; var6 < this.y2.size(); var6++) {
            var5[var6] = this.y2.get_Item(var6);
         }

         return var5;
      } else {
         List var1 = new List();
         com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

         for (int var3 = 0; var3 < this.m1.length(); var3++) {
            switch (this.m1.charAt(var3)) {
               case '%':
                  if (var3 < this.m1.length() - 2 && this.m1.charAt(var3 + 1) == '5' && this.m1.charAt(var3 + 2) == 'C') {
                     var2.n5("%5C");
                     var1.addItem(var2.toString());
                     var2.n5(0);
                     var3 += 2;
                  } else {
                     var2.n5('%');
                  }
                  break;
               case '/':
               case '\\':
                  var2.n5(this.m1.charAt(var3));
                  var1.addItem(var2.toString());
                  var2.n5(0);
                  break;
               default:
                  var2.n5(this.m1.charAt(var3));
            }
         }

         if (var2.l6() > 0) {
            var1.addItem(var2.toString());
         }

         if (this.c8() && var1.size() > 0) {
            String var7 = (String)var1.get_Item(0);
            if (var7.length() > 1 && var7.charAt(1) == ':') {
               var1.insertItem(0, "/");
            }
         }

         this.y2 = var1;
         String[] var8 = new String[var1.size()];

         for (int var4 = 0; var4 < var1.size(); var4++) {
            var8[var4] = this.y2.get_Item(var4);
         }

         return var8;
      }
   }

   public String t4() {
      this.r4();
      return this.z8 == null ? d1.n5 : this.z8;
   }

   public String q0() {
      this.r4();
      String var1 = this.a6();
      if (this.u9() == 4) {
         var1 = d1.l6(this.a6(), 1, this.a6().length() - 2);
         if (this.c4 != 0L) {
            var1 = d1.n5(var1, d1.n5(new String[]{"%", p3.l6(this.c4)}));
         }
      }

      return this.u9(var1);
   }

   public boolean z3() {
      return this.r4;
   }

   public String m1() {
      return this.z1 != null ? this.z1 : this.toString();
   }

   public static int n5(String var0) {
      if (var0 == null || var0.length() == 0) {
         return 0;
      }

      if (l6(var0)) {
         return 3;
      }

      if (k5(var0)) {
         return 2;
      }

      com.aspose.slides.internal.a6z.l6 var1 = null;
      com.aspose.slides.internal.a6z.l6[] var2 = new com.aspose.slides.internal.a6z.l6[]{var1};
      boolean var3 = com.aspose.slides.internal.a6z.l6.n5(var0, var2);
      var1 = var2[0];
      return var3 ? 4 : 0;
   }

   static boolean l6(String var0) {
      String[] var1 = d1.u9(var0, '.');
      if (var1.length != 4) {
         return false;
      }

      for (int var2 = 0; var2 < 4; var2++) {
         int var3 = var1[var2].length();
         if (var3 == 0) {
            return false;
         }

         long var4 = 0L;
         long[] var6 = new long[]{0L};
         boolean var7 = !l4.n5(var1[var2], var6);
         var4 = var6[0];
         if (var7) {
            return false;
         }

         if ((var4 & 4294967295L) > 255L) {
            return false;
         }
      }

      return true;
   }

   static boolean k5(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var2 == 0) {
            if (!com.aspose.slides.ms.System.t9.h0(var4)) {
               return false;
            }
         } else if (var4 == '.') {
            if (var3 + 1 < var1 && var0.charAt(var3 + 1) == '.') {
               return false;
            }

            var2 = 0;
         } else if (!com.aspose.slides.ms.System.t9.h0(var4) && var4 != '-' && var4 != '_') {
            return false;
         }

         if (++var2 == 64) {
            return false;
         }
      }

      return true;
   }

   public static boolean u3(String var0) {
      if (var0 != null && var0.length() != 0) {
         if (!u9(var0.charAt(0))) {
            return false;
         }

         int var1 = var0.length();

         for (int var2 = 1; var2 < var1; var2++) {
            char var3 = var0.charAt(var2);
            if (!com.aspose.slides.ms.System.t9.u3(var3) && !u9(var3) && var3 != '.' && var3 != '+' && var3 != '-') {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static boolean u9(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @Override
   public boolean equals(Object comparand) {
      if (comparand == null) {
         return false;
      }

      r8 var2 = comparand instanceof r8 ? (r8)comparand : null;
      if (var2 == null) {
         String var3 = comparand instanceof String ? (String)comparand : null;
         if (var3 == null) {
            return false;
         }

         r8[] var4 = new r8[]{var2};
         boolean var5 = !n5(var3, 0, var4);
         var2 = var4[0];
         if (var5) {
            return false;
         }
      }

      return this.k5(var2);
   }

   private boolean k5(r8 var1) {
      if (this.r4 != var1.r4) {
         return false;
      }

      if (!this.r4) {
         return d1.a6(this.z1, var1.z1);
      }

      com.aspose.slides.internal.x7n.l6 var2 = com.aspose.slides.internal.x7n.l6.k5();
      return d1.a6(d1.n5(this.t4, var2), d1.n5(var1.t4, var2))
         && d1.a6(d1.n5(this.q0, var2), d1.n5(var1.q0, var2))
         && this.z3 == var1.z3
         && d1.a6(this.k7, var1.k7)
         && d1.a6(this.m1, var1.m1);
   }

   public static boolean n5(r8 var0, r8 var1) {
      return j8.n5(var0, var1);
   }

   @Override
   public int hashCode() {
      if (this.s3 == 0) {
         com.aspose.slides.internal.x7n.l6 var1 = com.aspose.slides.internal.x7n.l6.k5();
         if (this.r4) {
            this.s3 = d1.n5(this.t4, var1).hashCode() ^ d1.n5(this.q0, var1).hashCode() ^ this.z3 ^ this.k7.hashCode() ^ this.m1.hashCode();
         } else {
            this.s3 = this.z1.hashCode();
         }
      }

      return this.s3;
   }

   public String n5(int var1) {
      this.r4();
      switch (var1) {
         case 0:
            return d1.n5(new String[]{this.t4, this.j5()});
         case 1:
            if (!d1.a6(this.t4, h0) && !d1.a6(this.t4, c8)) {
               com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
               var5.n5(this.t4);
               var5.n5(this.j5());
               if (this.m1.length() > 1 && this.m1.charAt(1) == ':' && d1.a6(l6, this.t4)) {
                  var5.n5('/');
               }

               if (this.z8 != null) {
                  var5.n5(this.z8).n5('@');
               }

               var5.n5(this.q0);
               int var7 = c8(this.t4);
               if (this.z3 != -1 && this.z3 != var7) {
                  var5.n5(':').k5(this.z3);
               }

               return var5.toString();
            }

            return d1.n5;
         case 2:
            com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
            var4.n5(this.t4);
            var4.n5(this.j5());
            if (this.m1.length() > 1 && this.m1.charAt(1) == ':' && d1.a6(l6, this.t4)) {
               var4.n5('/');
            }

            if (this.z8 != null) {
               var4.n5(this.z8).n5('@');
            }

            var4.n5(this.q0);
            int var6 = c8(this.t4);
            if (this.z3 != -1 && this.z3 != var6) {
               var4.n5(':').k5(this.z3);
            }

            if (this.m1.length() > 0) {
               if (!"mailto".equals(this.t4) && !"news".equals(this.t4)) {
                  var4.n5(k5(this.m1, z3(this.t4)));
               } else {
                  var4.n5(this.m1);
               }
            } else if (this.m1.length() == 0 && d1.a6(l6, this.t4)) {
               var4.n5('/');
            }

            return var4.toString();
         case 3:
            if (this.m1.length() == 0) {
               return "";
            }

            com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
            var2.n5(this.t4);
            var2.n5(this.j5());
            if (this.m1.length() > 1 && this.m1.charAt(1) == ':' && d1.a6(l6, this.t4)) {
               var2.n5('/');
            }

            if (this.z8 != null) {
               var2.n5(this.z8).n5('@');
            }

            var2.n5(this.q0);
            int var3 = c8(this.t4);
            if (this.z3 != -1 && this.z3 != var3) {
               var2.n5(':').k5(this.z3);
            }

            if (this.m1.length() > 0) {
               if (!"mailto".equals(this.t4) && !"news".equals(this.t4)) {
                  var2.n5(k5(this.m1, z3(this.t4)));
               } else {
                  var2.n5(this.m1);
               }
            } else if (this.m1.length() == 0 && d1.a6(l6, this.t4)) {
               var2.n5('/');
            }

            return var2.toString() + this.e2();
         default:
            throw new ArgumentException();
      }
   }

   public static int n5(char var0) {
      if ('0' <= var0 && var0 <= '9') {
         return var0 - 48;
      } else if ('a' <= var0 && var0 <= 'f') {
         return var0 - 97 + 10;
      } else if ('A' <= var0 && var0 <= 'F') {
         return var0 - 65 + 10;
      } else {
         throw new ArgumentException("digit");
      }
   }

   public static String l6(char var0) {
      if (var0 > 255) {
         throw new ArgumentOutOfRangeException("character");
      } else {
         return d1.n5(new Object[]{"%", p8.charAt((var0 & 240) >> 4), p8.charAt(var0 & 15)});
      }
   }

   public static boolean k5(char var0) {
      return '0' <= var0 && var0 <= '9' || 'a' <= var0 && var0 <= 'f' || 'A' <= var0 && var0 <= 'F';
   }

   public static boolean n5(String var0, int var1) {
      return var1 + 3 > var0.length() ? false : var0.charAt(var1++) == '%' && k5(var0.charAt(var1++)) && k5(var0.charAt(var1));
   }

   public r8 n5(r8 var1) {
      if (d1.a6(this.a6() + ":" + this.y4(), var1.a6() + ":" + var1.y4()) && d1.a6(this.t9(), var1.t9())) {
         String var2 = d1.n5;
         if (!d1.a6(this.m1, var1.m1)) {
            String[] var3 = this.z1();
            String[] var4 = var1.z1();
            int var5 = 0;
            int var6 = Math.min(var3.length, var4.length);

            while (var5 < var6 && d1.a6(var3[var5], var4[var5])) {
               var5++;
            }

            for (int var7 = var5 + 1; var7 < var3.length; var7++) {
               var2 = d1.n5(var2, "../");
            }

            for (int var10 = var5; var10 < var4.length; var10++) {
               var2 = d1.n5(var2, var4[var10]);
            }

            if (var2.length() == 0 && var3[var3.length - 1].endsWith("/")) {
               var2 = d1.n5(var2, "../");
            }
         }

         String[] var9 = new String[]{var2};
         var1.n5(var9);
         var2 = var9[0];
         return new r8(var2, 2);
      } else {
         return var1;
      }
   }

   private void n5(String[] var1) {
      if (this.k7.length() > 0) {
         String var2 = this.k7.charAt(0) == '?' ? d1.n5(new Object[]{'?', n5(d1.k5(this.k7, 1), true, false)}) : n5(this.k7, false);
         var1[0] = d1.n5(var1[0], var2);
      }

      if (this.m3.length() > 0) {
         var1[0] = d1.n5(var1[0], n5(this.m3, true, false));
      }
   }

   @Override
   public String toString() {
      if (this.d2 != null) {
         return this.d2;
      }

      if (this.r4) {
         this.d2 = n5(this.n5(2), true);
         String[] var1 = new String[]{this.d2};
         this.n5(var1);
         this.d2 = var1[0];
      } else {
         this.d2 = this.m1;
      }

      return this.d2;
   }

   @Deprecated
   protected static String a6(String var0) {
      return n5(var0, n3);
   }

   static String n5(String var0, String var1) {
      return n5(var0, var1, true);
   }

   static String n5(String var0, String var1, boolean var2) {
      if (d1.n5(var0)) {
         return d1.n5;
      }

      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      int var4 = var0.length();

      for (int var5 = 0; var5 < var4; var5++) {
         if (n5(var0, var5)) {
            var3.n5(d1.l6(var0, var5, 3));
            var5 += 2;
         } else {
            char var6 = var0.charAt(var5);
            boolean var7 = var6 <= ' ' || var6 >= 127;
            boolean var8 = d1.u3(var1, var6) != -1;
            if (var2 && var7) {
               byte[] var9 = com.aspose.slides.internal.l7h.j5.z3().l6(new char[]{var6});
               int var10 = var9.length;

               for (int var11 = 0; var11 < var10; var11++) {
                  var6 = com.aspose.slides.ms.System.z3.l6(var9[var11] & 255);
                  if (!var8 && !var2) {
                     var3.n5(var6);
                  } else {
                     var3.n5(l6(var6));
                  }
               }
            } else if (var8) {
               var3.n5(l6(var6));
            } else {
               var3.n5(var6);
            }
         }
      }

      return var3.toString();
   }

   private void n5(int var1, r8$n5 var2) {
      this.n5(var1, this.z1, var2);
      if (!this.y1) {
         this.q0 = n5(this.q0, b3, false);
         if (this.q0.length() > 1 && this.q0.charAt(0) != '[' && this.q0.charAt(this.q0.length() - 1) != ']') {
            this.q0 = d1.n5(this.q0, com.aspose.slides.internal.x7n.l6.k5());
         }

         if (this.r4 && this.m1.length() > 0) {
            this.m1 = a6(this.m1);
         }
      }
   }

   @Deprecated
   protected String u9(String var1) {
      return n5(var1, false, false);
   }

   static String n5(String var0, boolean var1) {
      return n5(var0, var1, var1);
   }

   static String n5(String var0, boolean var1, boolean var2) {
      if (d1.n5(var0)) {
         return d1.n5;
      }

      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      int var4 = var0.length();

      for (int var11 = 0; var11 < var4; var11++) {
         char var6 = var0.charAt(var11);
         if (var6 == '%') {
            char var7 = '\u0000';
            int[] var8 = new int[]{var11};
            char[] var9 = new char[]{'\u0000'};
            char var10 = n5(var0, var8, var9);
            var11 = var8[0];
            var7 = var9[0];
            if (var1 && var10 == '#') {
               var3.n5("%23");
            } else if (var1 && var10 == '%') {
               var3.n5("%25");
            } else if (var1 && var10 == '?') {
               var3.n5("%3F");
            } else if (var2 && var10 == '\\') {
               var3.n5("%5C");
            } else {
               var3.n5(var10);
               if (var7 != 0) {
                  var3.n5(var7);
               }
            }

            var11--;
         } else {
            var3.n5(var6);
         }
      }

      return var3.toString();
   }

   private void y4(String var1) {
      this.t4 = l6;
      this.z3 = -1;
      this.m3 = d1.n5;
      this.k7 = d1.n5;
      this.j5 = true;
      var1 = d1.u3(var1,new char[]{ '\\'});
      int var2 = d1.u3(var1, '\\');
      if (var2 > 0) {
         this.m1 = d1.k5(var1, var2);
         this.q0 = d1.l6(var1, 0, var2);
      } else {
         this.q0 = var1;
         this.m1 = d1.n5;
      }

      this.r4 = false;
      this.m1 = d1.n5(this.m1, "\\", "/");
   }

   private String e2(String var1) {
      if (var1.length() > 2 && var1.charAt(2) != '\\' && var1.charAt(2) != '/') {
         return "Relative file path is not allowed.";
      }

      this.t4 = l6;
      this.q0 = d1.n5;
      this.z3 = -1;
      this.m1 = d1.n5(var1, "\\", "/");
      this.m3 = d1.n5;
      this.k7 = d1.n5;
      return null;
   }

   private void t9(String var1) {
      this.t9 = true;
      this.t4 = l6;
      this.z3 = -1;
      this.m3 = d1.n5;
      this.k7 = d1.n5;
      this.q0 = d1.n5;
      this.m1 = null;
      if (var1.length() >= 2 && var1.charAt(0) == '/' && var1.charAt(1) == '/') {
         var1 = d1.u3(var1,new char[]{ '/'});
         this.m1 = d1.n5(new Object[]{'/', var1});
      }

      if (this.m1 == null) {
         this.m1 = var1;
      }
   }

   private void n5(int var1, String var2, r8$n5 var3) {
      if (var2 == null) {
         throw new ArgumentNullException("uriString");
      }

      String var4 = this.l6(var1, var2, var3);
      if (var4 != null) {
         throw new UriFormatException(var4);
      }
   }

   private boolean z8() {
      return !d1.a6(this.t4, t2) && !d1.a6(this.t4, k5) && !d1.a6(this.t4, l6);
   }

   private static String[] z1(String var0) {
      Pattern var1 = Pattern.compile(y5.u3.toString());
      Matcher var2 = var1.matcher(var0);
      if (!var2.matches()) {
         return null;
      }

      String var3 = var2.group(2);
      String var4 = var2.group(4);
      String var5 = var2.group(5);
      String var6 = var2.group(7);
      String var7 = var2.group(9);
      return new String[]{var3, var4, var5, var6, var7};
   }

   private static boolean t4(String var0) {
      String[] var1 = z1(var0);
      if (var1 == null) {
         return false;
      }

      String var2 = var1[0];
      String var3 = var1[1];
      String var4 = var1[2];
      String var5 = var1[3];
      String var6 = var1[4];
      boolean var7 = var3 != null && var3.length() > 0
         || var4 != null && var4.length() > 0
         || var5 != null && var5.length() > 0
         || var6 != null && var6.length() > 0;
      boolean var8 = var3 != null && var4 != null;
      boolean var9 = var3 == null && var4 != null && var4.matches("[a-zA-Z][\\|].*");
      return (var7 || var8) && !var9 && (var2 == null || var2.length() == 0);
   }

   private static boolean q0(String var0) {
      String[] var1 = z1(var0);
      if (var1 == null) {
         return false;
      }

      String var2 = var1[1];
      String var3 = var1[2];
      String var4 = var1[3];
      String var5 = var1[4];
      boolean var6 = var2 != null && var2.length() > 0
         || var3 != null && var3.length() > 0
         || var4 != null && var4.length() > 0
         || var5 != null && var5.length() > 0;
      boolean var7 = var2 != null && var3 != null && var4 != null;
      boolean var8 = var2 == null && var3 != null && var3.length() > 0 && var4 == null && var5 != null;
      boolean var9 = (var2 == null || var2.length() == 0) && (var3 == null || var3.length() == 0) && (var4 == null || var4.length() == 0) && var5 != null;
      return (var6 || var7) && !var8 && !var9;
   }

   private String l6(int var1, String var2, r8$n5 var3) {
      var2 = d1.l6(var2);
      int var4 = var2.length();
      if (var4 != 0 || var1 != 2 && var1 != 0) {
         if (var4 <= 1 && var1 == 1) {
            return "Absolute URI is too short";
         }

         int var5 = 0;
         if (var2.charAt(0) == '/' && com.aspose.slides.internal.z0k.z1.k5 == '/') {
            this.t9(var2);
            if (var1 == 2) {
               this.r4 = false;
            }

            return null;
         } else if (var2.length() >= 2 && var2.charAt(0) == '\\' && var2.charAt(1) == '\\') {
            this.y4(var2);
            if (var1 == 1) {
               this.r4 = true;
            }

            return null;
         } else if (var2.startsWith("file:") && d1.c8(var2, "\\\\") > 0) {
            this.t4 = l6;
            this.z3 = -1;
            this.m3 = d1.n5;
            this.k7 = d1.n5;
            this.j5 = true;
            if (var1 == 1) {
               this.r4 = true;
            }

            var2 = var2.replace("file:", "");
            if (var2.startsWith("/")) {
               var2 = d1.u3(var2,new char[]{ '/'});
            }

            var2 = d1.u3(var2,new char[]{ '\\'});
            var5 = d1.u3(var2, '\\');
            if (var5 > 0) {
               this.m1 = d1.k5(var2, var5);
               this.q0 = d1.l6(var2, 0, var5);
            } else {
               this.q0 = var2;
               this.m1 = d1.n5;
            }

            this.m1 = d1.n5(this.m1, "\\", "/");
            return null;
         } else {
            var5 = d1.u3(var2, ':');
            if (var5 == 0) {
               if (var1 == 1) {
                  return "Invalid URI: The format of the URI could not be determined.";
               }

               this.r4 = false;
               this.m1 = var2;
               return null;
            } else if (var5 < 0) {
               this.r4 = false;
               this.m1 = var2;
               String var30 = "Not match to the RFC 2396";
               if (var3 == r8$n5.l6) {
                  return q0(this.m1) ? null : var30;
               } else if (var3 == r8$n5.n5) {
                  return t4(this.m1) ? null : var30;
               } else {
                  return null;
               }
            } else if (var5 != 1) {
               this.t4 = d1.n5(d1.l6(var2, 0, var5), com.aspose.slides.internal.x7n.l6.k5());
               if (u3(this.t4)) {
                  int var29 = var5 + 1;
                  int var7 = var2.length();
                  var5 = d1.l6(var2, '#', var29);
                  if (!this.s7() && var5 != -1) {
                     if (this.y1) {
                        this.m3 = d1.k5(var2, var5);
                     } else {
                        this.m3 = d1.n5(new String[]{"#", a6(d1.k5(var2, var5 + 1))});
                     }

                     var7 = var5;
                  }

                  if (d1.a6(this.t4, c8)) {
                     var5 = this.t4.length() + 1;
                     this.m1 = n5(d1.l6(var2, var5, var7 - var5), e5);
                     return null;
                  }

                  if (this.z8()) {
                     var5 = d1.l6(var2, '?', var29, var7 - var29);
                     if (var5 != -1) {
                        this.k7 = d1.l6(var2, var5, var7 - var5);
                        var7 = var5;
                        if (!this.y1) {
                           this.k7 = a6(this.k7);
                        }
                     }
                  }

                  if (var3 == r8$n5.k5
                     || var1 == 1
                     || !k7(this.t4)
                     || d1.a6(this.t4, h0)
                     || d1.a6(this.t4, c8)
                     || var7 - var29 >= 2 && (var7 - var29 < 2 || var2.charAt(var29) != '/' || var2.charAt(var29 + 1) == '/')) {
                     if (!k7(this.t4)
                        || d1.a6(this.t4, h0)
                        || var7 - var29 >= 2 && (var7 - var29 < 2 || var2.charAt(var29) != '/' || var2.charAt(var29 + 1) == '/')) {
                        boolean var8 = var7 - var29 >= 2 && var2.charAt(var29) == '/' && var2.charAt(var29 + 1) == '/';
                        boolean var9 = d1.a6(this.t4, l6) && var8 && (var7 - var29 == 2 || var2.charAt(var29 + 2) == '/');
                        boolean var10 = false;
                        if (var8) {
                           if (var1 == 2) {
                              return "Absolute URI when we expected a relative one";
                           }

                           if (!d1.a6(this.t4, h0)) {
                              var29 += 2;
                           }

                           if (d1.a6(this.t4, l6)) {
                              int var11 = 2;

                              for (int var12 = var29; var12 < var7 && var2.charAt(var12) == '/'; var12++) {
                                 var11++;
                              }

                              if (var11 >= 4) {
                                 var9 = false;

                                 while (var29 < var7 && var2.charAt(var29) == '/') {
                                    var29++;
                                 }
                              } else if (var11 >= 3) {
                                 var29++;
                              }
                           }

                           if (var7 - var29 > 1 && var2.charAt(var29 + 1) == ':') {
                              var9 = false;
                              var10 = true;
                           }
                        } else if (!k7(this.t4)) {
                           this.m1 = d1.l6(var2, var29, var7 - var29);
                           this.w1 = true;
                           return null;
                        }

                        if (var9) {
                           var5 = -1;
                        } else {
                           var5 = d1.l6(var2, '/', var29, var7 - var29);
                           if (var5 == -1 && var10) {
                              var5 = d1.l6(var2, '\\', var29, var7 - var29);
                           }
                        }

                        if (var5 != -1) {
                           this.m1 = d1.l6(var2, var5, var7 - var5);
                           if (!this.z8()) {
                              if (!d1.a6(this.t4, t2)) {
                                 this.m1 = d1.n5(this.m1, '\\', '/');
                              }

                              this.m1 = n5(this.m1, e5);
                           }

                           var7 = var5;
                        } else if (!d1.a6(this.t4, h0)) {
                           this.m1 = "/";
                        }

                        if (var9) {
                           var5 = -1;
                        } else {
                           var5 = d1.l6(var2, '@', var29, var7 - var29);
                        }

                        if (var5 != -1) {
                           if (d1.a6(this.t4, l6)) {
                              return "Invalid host";
                           }

                           this.z8 = d1.l6(var2, var29, var5 - var29);
                           var29 = var5 + 1;
                        }

                        boolean var31 = true;
                        this.z3 = -1;
                        if (var9) {
                           var5 = -1;
                        } else {
                           var5 = d1.n5(var2, ':', var7 - 1, var7 - var29);
                        }

                        if (var5 != -1 && var5 != var7 - 1) {
                           String var32 = d1.l6(var2, var5 + 1, var7 - (var5 + 1));
                           if (var32.length() > 0 && var32.charAt(var32.length() - 1) != ']') {
                              int[] var13 = new int[]{this.z3};
                              boolean var14 = !a3.n5(var32, 7, com.aspose.slides.internal.x7n.l6.k5(), var13);
                              if (!var14) {
                                 this.z3 = var13[0];
                              }

                              var14 = var14 && this.z3 < 0 || this.z3 > 65535;
                              if (var14) {
                                 var31 = false;
                              } else {
                                 var7 = var5;
                              }
                           } else if (this.z3 == -1) {
                              this.z3 = c8(this.t4);
                           }
                        } else if (!this.c8()) {
                           if (var5 == var7 - 1) {
                              var7--;
                           }

                           if (this.z3 == -1) {
                              this.z3 = c8(this.t4);
                           }
                        }

                        var2 = d1.l6(var2, var29, var7 - var29);
                        this.q0 = var2;
                        if (var9) {
                           this.m1 = k5(d1.n5(new Object[]{'/', var2}), true);
                           this.q0 = d1.n5;
                        } else if (this.q0.length() == 2 && this.q0.charAt(1) == ':') {
                           if (!d1.a6(this.t4, l6)) {
                              this.q0 = com.aspose.slides.ms.System.t9.q0(this.q0.charAt(0));
                           } else {
                              this.m1 = d1.n5(new String[]{this.q0, this.m1});
                              this.q0 = d1.n5;
                           }
                        } else if (this.t9) {
                           var2 = d1.n5(new String[]{"//", var2});
                           this.q0 = d1.n5;
                        } else if (d1.a6(this.t4, l6)) {
                           this.j5 = i1;
                        } else if (this.q0.length() == 0
                           && (d1.a6(this.t4, a6) || d1.a6(this.t4, u3) || d1.a6(this.t4, t2) || d1.a6(this.t4, u9) || d1.a6(this.t4, k5))) {
                           return "Invalid URI: The Authority/Host could not be parsed.";
                        }

                        if (this.q0.length() > 0) {
                           switch (n5(this.q0)) {
                              case 0:
                                 if (this.q0.charAt(0) == ':' || this.q0.charAt(0) == '@') {
                                    return "Invalid URI: The hostname could not be parsed.";
                                 }

                                 if (d1.u3(this.q0, ':') != -1) {
                                    return "Invalid URI: Invalid port specified.";
                                 }
                                 break;
                              case 4:
                                 com.aspose.slides.internal.a6z.l6 var33 = null;
                                 com.aspose.slides.internal.a6z.l6[] var36 = new com.aspose.slides.internal.a6z.l6[]{var33};
                                 boolean var39 = com.aspose.slides.internal.a6z.l6.n5(this.q0, var36);
                                 var33 = var36[0];
                                 if (var39) {
                                    this.q0 = "[" + var33.n5(true) + "]";
                                    this.c4 = var33.l6();
                                 }
                           }
                        }

                        if (!var31) {
                           return "Invalid URI: Invalid port number";
                        }

                        UriFormatException var35 = null;
                        if (this.w1() != null) {
                           UriFormatException[] var37 = new UriFormatException[]{var35};
                           this.w1().n5(this, var37);
                           var35 = var37[0];
                        }

                        if (var35 != null) {
                           return var35.getMessage();
                        }

                        if (!d1.a6(this.t4, h0) && !d1.a6(this.t4, l6)) {
                           this.m1 = k5(this.m1, z3(this.t4));
                        }

                        return null;
                     } else {
                        return "Invalid URI: The Authority/Host could not be parsed.";
                     }
                  } else {
                     this.r4 = false;
                     return null;
                  }
               } else {
                  if (var1 == 1) {
                     return "Invalid URI: The URI scheme is not valid.";
                  }

                  this.r4 = false;
                  this.m1 = var2;
                  String var28 = "Not match to the RFC 2396";
                  return t4(this.m1) ? null : var28;
               }
            } else {
               if (u9(var2.charAt(0))) {
                  String var6 = this.e2(var2);
                  return var6 != null ? var6 : null;
               }

               if (var1 == 1) {
                  return "Invalid URI: The URI scheme is not valid.";
               }

               this.r4 = false;
               this.m1 = var2;
               return null;
            }
         }
      } else {
         this.r4 = false;
         return null;
      }
   }

   private static boolean z3(String var0) {
      if (var0 != null && var0.length() >= 4) {
         char var1 = var0.charAt(0);
         if (var1 == 'h') {
            return "http".equals(var0) || "https".equals(var0);
         } else if (var1 == 'f' && "file".equals(var0)) {
            return true;
         } else {
            return var1 != 'n' ? false : "net.pipe".equals(var0) || "net.tcp".equals(var0);
         }
      } else {
         return false;
      }
   }

   private static String m1(String var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         switch (var3) {
            case '%':
               if (var2 < var0.length() - 2) {
                  char var4 = var0.charAt(var2 + 1);
                  char var5 = com.aspose.slides.ms.System.t9.z3(var0.charAt(var2 + 2));
                  if (var4 == '2' && var5 == 'E') {
                     var3 = '.';
                     var2 += 2;
                  } else if (var4 == '2' && var5 == 'F' || var4 == '5' && var5 == 'C') {
                     var3 = '/';
                     var2 += 2;
                  }
               }
               break;
            case '\\':
               var3 = '/';
         }

         var1.n5(var3);
      }

      return var1.toString();
   }

   private static String k5(String var0, boolean var1) {
      if ("/".equals(var0)) {
         return var0;
      }

      if (var1 && d1.u3(var0, '%') != -1) {
         var0 = m1(var0);
      } else {
         var0 = d1.n5(var0, '\\', '/');
      }

      List var2 = new List();
      boolean var3 = true;
      int var4 = 0;

      while (var4 < var0.length()) {
         int var5 = d1.l6(var0, '/', var4);
         if (var5 == -1) {
            var5 = var0.length();
         }

         String var6 = d1.l6(var0, var4, var5 - var4);
         var4 = var5 + 1;
         if ((!var3 || var6.length() != 0) && !".".equals(var6)) {
            var3 = false;
            if ("..".equals(var6)) {
               int var7 = var2.size();
               if (var7 != 0) {
                  var2.removeAt(var7 - 1);
               }
            } else {
               var2.addItem(var6);
            }
         } else {
            var3 = false;
         }
      }

      if (var2.size() == 0) {
         return "/";
      }

      com.aspose.slides.internal.l7h.a5 var9 = new com.aspose.slides.internal.l7h.a5();
      if (var0.charAt(0) == '/') {
         var9.n5('/');
      }

      boolean var10 = true;

      for (Object recoveredElement$var12$50982 : var2) {
         String var12 = (String)recoveredElement$var12$50982;
         if (var10) {
            var10 = false;
         } else {
            var9.n5('/');
         }

         var9.n5(var12);
      }

      if (var0.charAt(var0.length() - 1) == '/') {
         var9.n5('/');
      }

      return var9.toString();
   }

   private static char n5(String var0, int[] var1, char[] var2) {
      var2[0] = 0;
      if (var0 == null) {
         throw new ArgumentException("pattern");
      }

      if (var1[0] < 0 || var1[0] >= var0.length()) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (!n5(var0, var1[0])) {
         return var0.charAt((int)(var1[0]++));
      }

      int var3 = var1[0]++;
      int var4 = n5(var0.charAt((int)(var1[0]++)));
      int var5 = n5(var0.charAt((int)(var1[0]++)));
      int var6 = var4;
      int var7 = 0;

      while ((var6 & 8) == 8) {
         var7++;
         var6 <<= 1;
      }

      if (var7 <= 1) {
         return (char)(var4 << 4 | var5);
      }

      byte[] var8 = new byte[var7];
      boolean var9 = false;
      var8[0] = (byte)(var4 << 4 | var5);

      for (int var10 = 1; var10 < var7; var10++) {
         if (!n5(var0, var1[0]++)) {
            var9 = true;
            break;
         }

         int var11 = n5(var0.charAt((int)(var1[0]++)));
         if ((var11 & 12) != 8) {
            var9 = true;
            break;
         }

         int var12 = n5(var0.charAt((int)(var1[0]++)));
         var8[var10] = (byte)(var11 << 4 | var12);
      }

      if (var9) {
         var1[0] = var3 + 3;
         return (char)(var8[0] & 0xFF);
      }

      byte var13 = -1;
      var13 = (byte)((var13 & 255) >> var7 + 1);
      int var15 = var8[0] & 255 & var13 & 255;

      for (int var18 = 1; var18 < var7; var18++) {
         var15 <<= 6;
         var15 |= var8[var18] & 255 & 63;
      }

      if (var15 <= 65535) {
         return (char)var15;
      }

      var15 -= 65536;
      var2[0] = (char)(var15 & 1023 | 56320);
      return (char)(var15 >> 10 | 55296);
   }

   static String h0(String var0) {
      for (int var1 = 0; var1 < e2.length; var1++) {
         if (d1.a6(e2[var1].n5, var0)) {
            return e2[var1].l6;
         }
      }

      return n5;
   }

   static int c8(String var0) {
      y5 var1 = y5.l6(var0);
      return var1 == null ? -1 : var1.n5();
   }

   private String j5() {
      return this.w1 ? ":" : h0(this.t4);
   }

   private static boolean k7(String var0) {
      if (var0 != null && var0.length() >= 3) {
         char var1 = var0.charAt(0);
         if (var1 == 'h') {
            return "http".equals(var0) || "https".equals(var0);
         } else if (var1 == 'f') {
            return "file".equals(var0) || "ftp".equals(var0);
         } else if (var1 == 'n') {
            var1 = var0.charAt(1);
            return var1 == 'e' ? "news".equals(var0) || "net.pipe".equals(var0) || "net.tcp".equals(var0) : "nntp".equals(var0);
         } else {
            return var1 == 'g' && "gopher".equals(var0) || var1 == 'm' && "mailto".equals(var0);
         }
      } else {
         return false;
      }
   }

   private y5 w1() {
      if (this.z7 == null) {
         this.z7 = y5.l6(this.t9());
         if (this.z7 == null) {
            this.z7 = new y1("*");
         }
      }

      return this.z7;
   }

   public boolean k7() {
      return d1.a6(n5(this.m1(), o0), this.m1());
   }

   static boolean u3(char var0) {
      return (var0 < 'A' || var0 > 'Z')
         && (var0 < 'a' || var0 > 'z')
         && (var0 < '0' || var0 > '9')
         && var0 != '_'
         && var0 != '~'
         && var0 != '!'
         && var0 != '\''
         && var0 != '('
         && var0 != ')'
         && var0 != '*'
         && var0 != '-'
         && var0 != '.';
   }

   public static String t2(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("stringToEscape");
      }

      if (var0.length() > 65519) {
         String var8 = d1.n5("Uri is longer than the maximum {0} characters.", new Object[]{65519});
         throw new UriFormatException(var8);
      }

      boolean var1 = false;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (u3(var3)) {
            var1 = true;
            break;
         }
      }

      if (!var1) {
         return var0;
      }

      com.aspose.slides.internal.l7h.a5 var9 = new com.aspose.slides.internal.l7h.a5();
      byte[] var10 = com.aspose.slides.internal.l7h.j5.z3().u3(var0);

      for (byte var7 : var10) {
         if (u3((char)(var7 & 0xFF))) {
            var9.n5(l6((char)(var7 & 0xFF)));
         } else {
            var9.n5((char)(var7 & 0xFF));
         }
      }

      return var9.toString();
   }

   static boolean a6(char var0) {
      return (var0 < 'A' || var0 > 'Z')
         && (var0 < 'a' || var0 > 'z')
         && (var0 < '&' || var0 > ';')
         && var0 != '!'
         && var0 != '#'
         && var0 != '$'
         && var0 != '='
         && var0 != '?'
         && var0 != '@'
         && var0 != '_'
         && var0 != '~';
   }

   public static String s7(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("stringToEscape");
      }

      if (var0.length() > 65519) {
         String var8 = d1.n5("Uri is longer than the maximum {0} characters.", new Object[]{65519});
         throw new UriFormatException(var8);
      }

      boolean var1 = false;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (a6(var3)) {
            var1 = true;
            break;
         }
      }

      if (!var1) {
         return var0;
      }

      com.aspose.slides.internal.l7h.a5 var9 = new com.aspose.slides.internal.l7h.a5();
      byte[] var10 = com.aspose.slides.internal.l7h.j5.z3().u3(var0);

      for (byte var7 : var10) {
         if (a6((char)(var7 & 0xFF))) {
            var9.n5(l6((char)(var7 & 0xFF)));
         } else {
            var9.n5((char)(var7 & 0xFF));
         }
      }

      return var9.toString();
   }

   public static boolean l6(String var0, int var1) {
      if (var0 == null) {
         return false;
      }

      r8 var2 = null;
      r8[] var3 = new r8[]{var2};
      boolean var4 = n5(var0, var1, var3, r8$n5.l6);
      var2 = var3[0];
      return var4 ? var2.k7() : false;
   }

   public static boolean n5(String var0, int var1, r8[] var2) {
      return n5(var0, var1, var2, null);
   }

   private static boolean n5(String var0, int var1, r8[] var2, r8$n5 var3) {
      boolean var4 = false;
      boolean[] var5 = new boolean[]{false};
      r8 var6 = new r8(var0, var1, var5, var3);
      var4 = var5[0];
      if (var4) {
         var2[0] = var6;
         return true;
      } else {
         var2[0] = null;
         return false;
      }
   }

   public static boolean n5(r8 var0, r8 var1, r8[] var2) {
      var2[0] = null;
      if (var0 != null && var0.z3()) {
         try {
            var2[0] = new r8(var0, var1.m1());
            return true;
         } catch (UriFormatException var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public static String x8(String var0) {
      return l6(var0, false);
   }

   static String l6(String var0, boolean var1) {
      if (var0 == null) {
         throw new ArgumentNullException("stringToUnescape");
      }

      if (d1.u3(var0, '%') == -1 && d1.u3(var0, '+') == -1) {
         return var0;
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      long var3 = var0.length();
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      for (int var6 = 0; var6 < var3; var6++) {
         if (var0.charAt(var6) == '%' && var6 + 2 < var3 && var0.charAt(var6 + 1) != '%') {
            int var7;
            if ((var7 = n5(var0, var6 + 1, 2, var1)) != -1) {
               var5.writeByte((byte)var7);
               var6 += 2;
            } else {
               if (!var1) {
                  throw new UriFormatException();
               }

               var2.n5('%');
            }
         } else {
            if (var0.charAt(var6) == '%') {
               throw new UriFormatException();
            }

            if (var5.getLength() > 0L) {
               var2.n5(n5(var5, com.aspose.slides.internal.l7h.j5.z3()));
               var5.setLength(0L);
            }

            var2.n5(var0.charAt(var6));
         }
      }

      if (var5.getLength() > 0L) {
         var2.n5(n5(var5, com.aspose.slides.internal.l7h.j5.z3()));
      }

      Object var8 = null;
      return var2.toString();
   }

   private static int n5(byte var0) {
      char var1 = (char)(var0 & 0xFF);
      if (var1 >= '0' && var1 <= '9') {
         return var1 - 48;
      } else if (var1 >= 'a' && var1 <= 'f') {
         return var1 - 97 + 10;
      } else {
         return var1 >= 65 && var1 <= 70 ? var1 - 65 + 10 : -1;
      }
   }

   private static int n5(String var0, int var1, int var2, boolean var3) {
      int var4 = 0;
      int var5 = var2 + var1;
      if (var0.charAt(var1) >= '0' && var0.charAt(var1) <= '9') {
         for (int var6 = var1; var6 < var5; var6++) {
            char var7 = var0.charAt(var6);
            if (var7 > 127) {
               return -1;
            }

            int var8 = n5((byte)var7);
            if (var8 == -1) {
               return -1;
            }

            var4 = (var4 << 4) + var8;
         }

         if (!var3) {
            return var4;
         }

         switch ((char)var4) {
            case '#':
            case '%':
            case '&':
            case '/':
            case '?':
            case '@':
            case '\\':
               return -1;
            default:
               return var4;
         }
      } else {
         return -1;
      }
   }

   private static char[] n5(com.aspose.slides.internal.z0k.e2 var0, com.aspose.slides.internal.l7h.j5 var1) {
      return var1.k5(var0.getBuffer(), 0, (int)var0.getLength());
   }

   private void r4() {
      if (!this.z3()) {
         throw new InvalidOperationException("This operation is not supported for a relative URI.");
      }
   }

   public static URI l6(r8 var0) {
      if (var0 == null) {
         return null;
      }

      try {
         return new URI(var0.toString());
      } catch (URISyntaxException var2) {
         throw new UriFormatException(var2.getMessage(), var2);
      }
   }

   public static r8 n5(URI var0) {
      return var0 == null ? null : new r8(var0.toString());
   }
}
