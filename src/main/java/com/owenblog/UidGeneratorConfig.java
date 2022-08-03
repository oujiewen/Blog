package com.owenblog;

import com.xfvape.uid.impl.CachedUidGenerator;
import com.xfvape.uid.worker.DisposableWorkerIdAssigner;
import com.xfvape.uid.worker.WorkerIdAssigner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p> 百度  Uid-Generator配置
 * @author zepal
 * */
@Configuration
public class UidGeneratorConfig {
 
	@Bean("disposableWorkerIdAssigner")
	public DisposableWorkerIdAssigner initDisposableWorkerIdAssigner() {
		DisposableWorkerIdAssigner disposableWorkerIdAssigner = new DisposableWorkerIdAssigner();
		return disposableWorkerIdAssigner;
	}
	
	@Bean("cachedUidGenerator")
	public CachedUidGenerator initCachedUidGenerator(WorkerIdAssigner workerIdAssigner) {
		CachedUidGenerator cachedUidGenerator = new CachedUidGenerator();
		cachedUidGenerator.setWorkerIdAssigner(workerIdAssigner);
		// 属性参考链接  https://github.com/baidu/uid-generator/blob/master/README.zh_cn.md
        // 以下为可选配置, 如未指定将采用默认值
		// cachedUidGenerator.setTimeBits(28);
		// cachedUidGenerator.setWorkerBits(22);
		// cachedUidGenerator.setSeqBits(13);
		// cachedUidGenerator.setEpochStr("2016-09-20");
		cachedUidGenerator.setBoostPower(3);
		cachedUidGenerator.setPaddingFactor(50);
		cachedUidGenerator.setScheduleInterval(60L);
//		// 拒绝策略: 当环已满, 无法继续填充时
		// 默认无需指定, 将丢弃Put操作, 仅日志记录. 如有特殊需求, 请实现RejectedPutBufferHandler接口(支持Lambda表达式)
		// 拒绝策略: 当环已空, 无法继续获取时
		// 默认无需指定, 将记录日志, 并抛出UidGenerateException异常. 如有特殊需求, 请实现RejectedTakeBufferHandler接口(支持Lambda表达式)
		return cachedUidGenerator;
	}
}