package com.github.houbb.segment.test.bs;

import com.github.houbb.segment.api.ISegmentResult;
import com.github.houbb.segment.bs.SegmentBs;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * 分词引导类实现
 * @author binbin.hou
 * @since 0.0.1
 */
public class SegmentBsTest {

    /**
     * 分词测试
     * @since 0.0.1
     */
    @Test
    public void segmentTest() {
        final String string = "这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱学习。";

        List<ISegmentResult> resultList = SegmentBs.newInstance().segment(string);
        Assert.assertEquals("[这[0,1), 是[1,2), 一个[2,4), 伸手不见五指[4,10), 的[10,11), 黑夜[11,13), 。[13,14), 我[14,15), 叫[15,16), 孙悟空[16,19), ，[19,20), 我[20,21), 爱[21,22), 北京[22,24), ，[24,25), 我[25,26), 爱[26,27), 学习[27,29), 。[29,30)]", resultList.toString());
    }

    /**
     * 分词测试
     * @since 0.0.1
     */
    @Test
    public void segmentWordsTest() {
        final String string = "这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱学习。";

        List<String> resultList = SegmentBs.newInstance().segmentWords(string);

        Assert.assertEquals("[这, 是, 一个, 伸手不见五指, 的, 黑夜, 。, 我, 叫, 孙悟空, ，, 我, 爱, 北京, ，, 我, 爱, 学习, 。]",
                resultList.toString());
    }

}