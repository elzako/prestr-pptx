package com.aspose.slides.internal.f5;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.c3.j3;
import com.aspose.slides.internal.i4.f5;
import com.aspose.slides.ms.System.d1;

public class k5 {
   private static final com.aspose.slides.internal.h0.c8 n5 = new com.aspose.slides.internal.h0.c8();
   private com.aspose.slides.internal.j3.z1 l6;
   private final n3 k5;
   private f5 u3;
   private com.aspose.slides.internal.h0.z8 a6;
   private com.aspose.slides.internal.p6.u3 u9;
   private final com.aspose.slides.internal.j4.k5 h0;
   private com.aspose.slides.internal.l7h.j5 c8;
   private com.aspose.slides.internal.l7h.j5 t2 = com.aspose.slides.internal.f5.c8.n5;
   private com.aspose.slides.internal.j4.l6 s7;
   private com.aspose.slides.internal.z5.l6 x8;

   public k5(com.aspose.slides.internal.j4.k5 var1, com.aspose.slides.internal.j4.l6 var2, com.aspose.slides.internal.z5.l6 var3) {
      this.h0 = var1;
      this.k5 = new n3(this);
      this.k5.n5(new s7(this));
      this.u3 = new f5();
      this.s7 = var2;
      this.x8 = var3;
      if (!d1.n5(var2.k5())) {
         try {
            this.t2 = com.aspose.slides.internal.n2d.x8.n5(var2.k5());
         } catch (ArgumentException var5) {
         }
      }

      this.c8 = this.t2;
   }

   public final com.aspose.slides.internal.j3.z1 n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.p6.n5 l6() {
      return (com.aspose.slides.internal.p6.n5)this.k5.n5("LS");
   }

   public final com.aspose.slides.internal.j3.x8 k5() {
      return this.k5.n5("CORE");
   }

   public final f5 u3() {
      return this.u3;
   }

   public final com.aspose.slides.internal.h0.z8 a6() {
      return this.a6;
   }

   public final com.aspose.slides.internal.j4.k5 u9() {
      return this.h0;
   }

   public final com.aspose.slides.internal.l7h.j5 h0() {
      return this.c8;
   }

   public final com.aspose.slides.internal.j4.l6 c8() {
      return this.s7;
   }

   public final com.aspose.slides.internal.z5.l6 t2() {
      return this.x8;
   }

   public final com.aspose.slides.internal.j3.z1 s7() {
      this.l6 = this.k5().n5("http://www.w3.org/1999/xhtml", d1.n5, null);
      this.u3 = new f5();
      this.u3.n5(new com.aspose.slides.internal.y5.q0());
      this.u3.n5(new com.aspose.slides.internal.q3.a6("document", this.l6));
      com.aspose.slides.internal.u3.h0 var1 = new com.aspose.slides.internal.u3.h0();
      var1.k5().n5(this.s7.u3().l6());
      var1.k5().l6(this.s7.u3().u3());
      var1.k5().n5(this.s7.u3().h0());
      var1.k5().n5(this.s7.u3().k5().u3());
      var1.k5().k5(this.s7.u3().c8());
      var1.k5().l6(this.s7.u3().a6().u3());
      String var2 = d1.n5(this.s7.l6()) ? "html" : this.s7.l6();
      var1.n5(d1.u3(var2, "XHTML", (short)5));
      this.a6 = n5.n5(
         com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.k5.m1.class),
         new com.aspose.slides.internal.h0.u3(new com.aspose.slides.internal.s9.n5(this.h0), var1)
      );
      ((com.aspose.slides.internal.w8.t9)this.l6).n5(this.a6);
      return this.l6;
   }

   public final com.aspose.slides.internal.j3.z1 n5(String var1) {
      this.c8 = this.t2;
      com.aspose.slides.internal.p6.l6 var2 = this.l6().k5();
      var2.n5(var1);
      return this.n5(var2);
   }

   private com.aspose.slides.internal.j3.z1 n5(com.aspose.slides.internal.p6.l6 var1) {
      if (this.l6 == null) {
         this.s7();
      }

      long var2 = -1L;
      if (var1.k5() == null) {
         var2 = var1.l6().getPosition();
      }

      com.aspose.slides.internal.c3.t2 var4 = new com.aspose.slides.internal.c3.t2(new j3(var1), this);
      com.aspose.slides.internal.l7h.j5 var5 = var4.n5();
      if (var2 != -1L) {
         var1.l6().setPosition(var2);
      }

      if (var5 != null && var5 != this.c8) {
         this.c8 = var5;
      }

      var1.l6(this.c8.s7());
      this.u9 = this.l6().n5(1, "");
      this.u9.n5(var1);
      if (this.n5().a6() == null) {
         this.a6.k5(com.aspose.slides.internal.s9.l6.n5);
      } else {
         this.a6
            .k5(
               "a\r\n{\r\n\tdisplay:inline;\r\n}\r\n:Link\r\n{\r\n    text-decoration:underline; \r\n\tcolor:Blue;\r\n}\r\naside\r\n{\r\n    display:block;\r\n}\r\naddress\r\n{\r\n    font-style: italic;\r\n\tdisplay: block;\r\n}\r\nabbr\r\n{\r\n    display:inline;\r\n}\r\nacronym\r\n{\r\n    display:inline;\r\n}\r\napplet\r\n{\r\n    display:inline;\r\n}\r\nbdo\r\n{\r\n    display:inline;\r\n}\r\nsection\r\n{\r\n    margin: 1.5em 0;\r\n    display: block;\r\n}\r\nblockquote\r\n{\r\n\tdisplay: block;\r\n\tmargin: 1.12em 40px;\r\n}\r\nmeter\r\n{\r\n    display:inline;\r\n}\r\nnav\r\n{\r\n    display:inline;\r\n}\r\nruby\r\n{\r\n    display:inline;\r\n}\r\nprogress\r\n{\r\n    display:inline;\r\n}\r\nfooter\r\n{\r\n    display:inline;\r\n}\r\nheader\r\n{\r\n    display:inline;\r\n}\r\nmark\r\n{\r\n    display:inline;\r\n    background-color:yellow;\r\n}\r\nbody\r\n{\r\n\tdisplay: block; \r\n    margin: 8px;\r\n\t/*color: black;*/\r\n\t/*background: white;*/\r\n}\r\ndd\r\n{\r\n\tmargin-left: 40px;\r\n\tdisplay: block;\r\n}\r\ndiv\r\n{\r\n\tdisplay: block;\r\n}\r\ndl\r\n{\r\n\tmargin: 1.12em 0;\r\n\tdisplay: block;\r\n}\r\ndt\r\n{\r\n\tdisplay: block;\r\n}\r\ndfn\r\n{\r\n    font-style: italic;\r\n    display:inline;\r\n}\r\nfieldset\r\n{\r\n    margin: 1.12em 0;\r\n\tdisplay: block;\r\n    border: solid 1px gray;\r\n    padding-bottom: 10px;\r\n}\r\nfigure\r\n{\r\n    margin-top: 1.12em;\r\n    margin-bottom: 1.12em;\r\n    margin-left: 2.12em;\r\n    margin-right: 2.12em;\r\n\tdisplay: block;\r\n}\r\nform\r\n{\r\n    margin: 1.12em 0;\r\n\tdisplay: block;\r\n}\r\nframe\r\n{\r\n\tdisplay: block;\r\n}\r\narticle\r\n{\r\n\tdisplay: block;\r\n}\r\nframeset\r\n{\r\n\tdisplay: block;\r\n}\r\ntime\r\n{\r\n    display:inline;\r\n}\r\nh1\r\n{\r\n    font-weight: bolder;\r\n    font-size: 2em;\r\n\tmargin: 0.67em 0;\t\r\n\tdisplay: block;\r\n}\r\nh2\r\n{\r\n    font-size: 1.5em;\r\n\tmargin: 0.75em 0;\r\n\tfont-weight: bolder;\r\n\tdisplay: block;\r\n}\r\nh3\r\n{\r\n    font-size: 1.17em;\r\n\tmargin: 0.83em 0;\r\n\tfont-weight: bolder;\r\n\tdisplay: block;\r\n}\r\nh4\r\n{\r\n    font-weight: bolder;\r\n\tdisplay: block;\r\n\tmargin: 1.12em 0;\r\n}\r\nh5\r\n{\r\n    font-weight: bolder;\r\n\tdisplay: block;\r\n\tfont-size: 0.83em;\r\n\tmargin: 1.5em 0;\r\n}\r\nh6\r\n{\r\n    font-weight: bolder;\r\n\tdisplay: block;\r\n\tfont-size:0.75em;\r\n\tmargin: 1.67em 0;\r\n}\r\nnoframes\r\n{\r\n\tdisplay: block;\r\n}\r\nol\r\n{\r\n    padding-left: 40px;\r\n\tdisplay: block;\r\n\tmargin: 1.12em 0;\r\n\tlist-style-type: decimal;\r\n}\r\np\r\n{\r\n\tdisplay: block;\r\n\tmargin: 1.12em 0;\r\n}\r\nul\r\n{\r\n    padding-left: 40px;\r\n\tdisplay: block;\r\n\tmargin: 1.12em 0;\r\n}\r\ncenter\r\n{\r\n\tdisplay: block;\r\n\ttext-align: center;\r\n}\r\ndir\r\n{\r\n    padding-left: 40px;\r\n    margin: 1.12em 0;\r\n\tdisplay: block;\r\n}\r\nhr\r\n{\r\n    /*border: 1px inset;*/\r\n    border: solid 1px gray;\r\n\tdisplay: block;\r\n\tmargin: 10px 0px;\r\n}\r\nmenu\r\n{\r\n    padding-left: 40px;\r\n    margin: 1.12em 0;\r\n\tdisplay: block;\r\n}\r\npre\r\n{\r\n    font-family: Courier New;\r\n    font-size: 0.87em;\r\n\twhite-space: pre;\r\n\tdisplay: block;\r\n}\r\nxmp\r\n{\r\n\tfont-family: Courier New;\r\n    font-size: 0.87em;\r\n\twhite-space: pre;\r\n\tdisplay: block;\r\n}\r\nplaintext\r\n{\r\n\tfont-family: Courier New;\r\n    font-size: 0.87em;\r\n\twhite-space: pre;\r\n\tdisplay: block;\r\n}\r\nspan\r\n{\r\n\tdisplay: inline;\r\n}\r\nli\r\n{\r\n\tdisplay: list-item;\r\n}\r\nhead\r\n{\r\n\tdisplay: none;\r\n}\r\ntable\r\n{\r\n    text-align: left;\r\n    font-weight: normal;\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n    border-collapse: separate;\r\n\twidth: auto;\r\n\theight: auto;\r\n    border-spacing: 2px;\r\n    border-style:none;\r\n\tdisplay: table;\r\n}\r\ntd, th\r\n{\r\n\tdisplay: table-cell;\r\n\tborder-style: none;\r\n    vertical-align: middle;\r\n\tvertical-align: inherit;\r\n}\r\nth\r\n{\r\n\tfont-weight: bolder;\r\n\ttext-align: center;\r\n}\r\ntr\r\n{\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n\twidth: auto;\r\n\theight: auto;\r\n    vertical-align: inherit;\r\n    border-style:none;\r\n\tdisplay: table-row;\r\n}\r\nthead\r\n{\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n\twidth: auto;\r\n\theight: auto;\r\n    vertical-align: middle;\r\n    border-style:solid;\r\n\tdisplay: table-header-group;\r\n}\r\ntbody\r\n{\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n\twidth: auto;\r\n\theight: auto;\r\n\tborder-style:solid;\r\n    vertical-align: middle;\r\n\tdisplay: table-row-group;\r\n}\r\ntfoot\r\n{\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n\twidth: auto;\r\n\theight: auto;\r\n    vertical-align: middle;\r\n    border-style:solid;\r\n\tdisplay: table-footer-group;\r\n}\r\ncol\r\n{\r\n\tdisplay: table-column;\r\n}\r\ncolgroup\r\n{\r\n\tdisplay: table-column-group;\r\n}\r\ncaption\r\n{\r\n\tdisplay: table-caption;\r\n\ttext-align: center;\r\n}\r\nb\r\n{\r\n\tfont-weight: bolder;\r\n\tdisplay:inline;\r\n}\r\nstrong\r\n{\r\n\tfont-weight: bolder;\r\n\tdisplay: inline;\r\n}\r\ni\r\n{\r\n\tfont-style: italic;\r\n\tdisplay:inline;\r\n}\r\ncite\r\n{\r\n\tfont-style: italic;\r\n\tdisplay:inline;\r\n}\r\nimg\r\n{\r\n    display:inline;\r\n}\r\nem\r\n{\r\n\tfont-style: italic;\r\n\tdisplay: inline;\r\n}\r\niframe\r\n{\r\n    display:inline;\r\n}\r\nvar\r\n{\r\n\tfont-style: italic;\r\n\tdisplay: inline;\r\n}\r\ntt\r\n{\r\n    font-family: monospace;\r\n    font-size: 0.87em;\r\n\tdisplay:inline;\r\n}\r\ncode\r\n{\r\n    font-family: monospace;\r\n    font-size: 0.87em;\r\n    display:inline;\r\n}\r\nq\r\n{\r\n    display:inline;\r\n    quotes: '\"' '\"';\r\n}\r\nq::before \r\n{\r\n    content: open-quote;\r\n}\r\nq::after \r\n{\r\n    content: close-quote;\r\n}\r\nlabel\r\n{\r\n    display:inline;\r\n}\r\nobject\r\n{\r\n    display:inline;\r\n}\r\nkbd\r\n{\r\n    font-family: monospace;\r\n    display:inline;\r\n    font-size: 0.87em;\r\n}\r\nsamp\r\n{\r\n    font-family: monospace;\r\n    font-size: 0.87em;\r\n    display:inline;\r\n}\r\nbutton\r\n{\r\n    display:inline;\r\n\tfont-style: italic;\r\n}\r\ntextarea\r\n{\r\n\tfont-style: italic;\r\n}\r\ninput\r\n{\r\n\tdisplay: inline-block;\r\n}\r\nselect\r\n{\r\n\tdisplay: inline-block;\r\n}\r\nbig\r\n{\r\n    font-size: larger;\r\n\t/*font-size: 1.333333em;*/\r\n\tdisplay:inline;\r\n}\r\nsmall\r\n{\r\n\tfont-size: smaller;\r\n\tdisplay:inline;\r\n}\r\ns\r\n{\r\n\ttext-decoration: line-through;\r\n\tdisplay: inline;\r\n}\r\nstrike\r\n{\r\n\ttext-decoration: line-through;\r\n\tdisplay:inline;\r\n}\r\ndel\r\n{\r\n    display:inline;\r\n\ttext-decoration: line-through;\r\n}\r\nol ul\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}\r\nul ol\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}\r\nul ul\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}\r\nol ol\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}\r\ntable, td, th \r\n{ \r\n    border-color: black;\r\n}\r\nu\r\n{\r\n\ttext-decoration: underline;\r\n\tdisplay: inline;\r\n}\r\nins\r\n{\r\n    display:inline;\r\n\ttext-decoration: underline;\r\n}\r\nfont\r\n{\r\n\tdisplay:inline;\r\n}\r\nsub\r\n{\r\n\tfont-size: 0.5em;\r\n\tvertical-align: sub;\r\n\tdisplay:inline;\r\n}\r\nsup\r\n{\r\n\tfont-size: 0.5em;\r\n\tvertical-align: super;\r\n\tdisplay:inline;\r\n}\r\noption\r\n{\r\n\tdisplay:inline;\r\n}\r\nselect\r\n{\r\n\tdisplay:inline;\r\n}\r\ncheckbox\r\n{\r\n\tdisplay:inline;\r\n}\r\n:root\r\n{\r\n    quotes: '\\201c' '\\201d' '\\2018' '\\2019';\r\n}\r\ntextarea\r\n{\r\n  \tdisplay:inline;\r\n}"
            );
      }

      if (this.x8 != null && this.x8.h0() != null && !d1.n5(this.x8.h0().c8())) {
         this.a6.u3(this.x8.h0().c8());
      }

      this.a6().n5(com.aspose.slides.internal.v6g.k5.n5(this.n5(), com.aspose.slides.internal.k5.m1.class));
      return this.n5();
   }

   public final void n5(String... var1) {
      if (this.u9 != null) {
         ((com.aspose.slides.internal.y8.u3)this.u9).n5(var1);
      }
   }

   public final void l6(String... var1) {
      if (this.u9 != null) {
         ((com.aspose.slides.internal.y8.u3)this.u9).l6(var1);
      }
   }
}
